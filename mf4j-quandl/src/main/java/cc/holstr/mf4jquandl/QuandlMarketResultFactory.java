package cc.holstr.mf4jquandl;

import cc.holstr.mf4j.impl.MarketResult;
import cc.holstr.mf4jquandl.exception.QuandlMalformedJSONException;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by Jason McElhenney on 4/21/17.
 * zudsniper on GitHub.
 */
public class QuandlMarketResultFactory {

	/**
	 * @param ticker The stock ticker of the compiled MarketResult.
	 * @param info An unformatted list containing stock data.
	 *
	 * @return A formatted MarketResult with the stockData from info.
	 * @throws QuandlMalformedJSONException if the length of info is less than the necessary length for parsing.
	 */
	public static MarketResult get(String ticker, List<String> info) throws QuandlMalformedJSONException {

		if(info.size() < 13) throw new QuandlMalformedJSONException();

		ZonedDateTime timestamp = ZonedDateTime.parse(info.get(0), QuandlMarket.dateTimeFormatter.withZone(ZoneId.systemDefault()));
		MarketResult result = new MarketResult();
		result.setTimestamp(timestamp);
		result.setTicker(ticker);
		result.setOpen(Double.parseDouble(info.get(1)));
		result.setHigh(Double.parseDouble(info.get(2)));
		result.setLow(Double.parseDouble(info.get(3)));
		result.setClose(Double.parseDouble(info.get(4)));
		result.setVolume(Long.parseLong(info.get(5)));
		result.setExDividend(Double.parseDouble(info.get(6)));
		result.setSplitRatio(Double.parseDouble(info.get(7)));
		result.setAdjustedOpen(Double.parseDouble(info.get(8)));
		result.setAdjustedHigh(Double.parseDouble(info.get(9)));
		result.setAdjustedLow(Double.parseDouble(info.get(10)));
		result.setAdjustedClose(Double.parseDouble(info.get(11)));
		result.setAdjustedVolume(Long.parseLong(info.get(12)));

		return result;
	}
}
