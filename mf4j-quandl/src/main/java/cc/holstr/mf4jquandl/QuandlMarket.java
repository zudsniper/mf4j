package cc.holstr.mf4jquandl;

import cc.holstr.mf4j.Market;
import cc.holstr.mf4j.exception.MarketRetrievalException;
import cc.holstr.mf4j.impl.MarketResult;
import cc.holstr.mf4j.impl.MarketResults;
import cc.holstr.mf4jquandl.exception.QuandlMalformedJSONException;
import cc.holstr.mf4jquandl.model.QuandlResponse;
import cc.holstr.util.http.HttpHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by Jason McElhenney on 4/21/17.
 * zudsniper on GitHub.
 */
public class QuandlMarket implements Market {

	public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private final String urlstub;
	private final String apikey;

	private Gson gson;

	public QuandlMarket(String apikey, boolean premium) {
		urlstub = "https://www.quandl.com/api/v3/datasets/" + (premium ? "EOC/" : "WIKI/");
		this.apikey = apikey;
		gson = new GsonBuilder().create();
	}

	public QuandlMarket(String urlstub, String apikey) {
		this.urlstub = urlstub;
		this.apikey = apikey;
		gson = new GsonBuilder().create();
	}

	public String getUrl(String ticker) {
		return urlstub + ticker + ".json?api_key=" + apikey;
	}

	public MarketResult singleDayQuery(String url) throws MarketRetrievalException {
		try {
			InputStreamReader reader = new InputStreamReader(HttpHelper.get(url), "UTF-8");
			QuandlResponse response = gson.fromJson(reader, QuandlResponse.class);
			return QuandlMarketResultFactory.get(response.getDataset().getDatasetCode(), response.getDataset().getData().get(0));
		} catch(QuandlMalformedJSONException e) {
			throw e;
		} catch(Exception e) {
			throw new MarketRetrievalException(e.getMessage());
		}
	}
	/**
	 * @param ticker the stock ticker being queried.
	 *
	 * @return A MarketResult object containing today's information on the given ticker.
	 */
	@Override
	public MarketResult ticker(String ticker) throws MarketRetrievalException {
		String url = getUrl(ticker) + "&limit=1";
		return singleDayQuery(url);
	}

	/**
	 * @param ticker   the stock ticker being queried.
	 * @param dateTime dateTime specifying the date on which to retrieve data.
	 *
	 * @return A MarketResult object containing the specified date's information on the given ticker.
	 */
	@Override
	public MarketResult ticker(String ticker, ZonedDateTime dateTime) throws MarketRetrievalException {
		String url = getUrl(ticker) + "&limit=1&start_date=" + dateTimeFormatter.format(dateTime);
		return singleDayQuery(url);
	}

	/**
	 * @param ticker         the stock ticker being queried.
	 * @param startInclusive starting date for the query.
	 * @param endInclusive   the ending date for the query.
	 *
	 * @return MarketResults object containing a sorted, in descending date order, list of MarketResults in the specified boundaries.
	 */
	@Override
	public MarketResults ticker(String ticker, ZonedDateTime startInclusive, ZonedDateTime endInclusive) throws MarketRetrievalException {
		String url = getUrl(ticker) + "&start_date=" + dateTimeFormatter.format(startInclusive) + "&end_date=" + dateTimeFormatter.format(endInclusive);
		MarketResults mks;
		try {
			mks = new MarketResults();
			InputStreamReader reader = new InputStreamReader(HttpHelper.get(url), "UTF-8");
			QuandlResponse response = gson.fromJson(reader, QuandlResponse.class);
			for(List<String> strings : response.getDataset().getData()) {
				mks.add(QuandlMarketResultFactory.get(ticker, strings));
			}
		} catch(QuandlMalformedJSONException e) {
			throw e;
		} catch(Exception e) {
			e.printStackTrace();
			throw new MarketRetrievalException(e.getMessage());
		}
		return mks;
	}
}
