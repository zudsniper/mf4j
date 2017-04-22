package cc.holstr.mf4j;

import cc.holstr.mf4j.exception.MarketRetrievalException;
import cc.holstr.mf4j.impl.MarketResults;
import cc.holstr.mf4jquandl.QuandlMarket;

import java.time.ZonedDateTime;

/**
 * Created by Jason McElhenney on 4/21/17.
 * zudsniper on GitHub.
 */
public class ExampleMF4JUsage {

	//TODO: always redact actual api key
	private static final String API_KEY = "N/A";

	public static void main(String[] args) throws MarketRetrievalException {
		Market market = new QuandlMarket(API_KEY, false);

		String[] tickers = {"AAPL","GOOG","AMZN"};

		double largestVolatility = Double.MIN_VALUE;
		String tickerWithLargestVolatility = "";
		for(String ticker : tickers) {
			MarketResults results = market.ticker(ticker, ZonedDateTime.now().minusDays(30),ZonedDateTime.now());
			double volit = 0.0;
			for(int i = 1; i<results.size(); i++) {
				volit += Math.abs(results.get(i).getAdjustedClose()-results.get(i-1).getAdjustedClose());
			}

			System.out.println("Ticker: " + ticker);
			System.out.println("Volatility: "+ volit);

			if(largestVolatility < volit) {
				largestVolatility = volit;
				tickerWithLargestVolatility = ticker;
			}
		}

		System.out.println("Ticker with the largest 30 day volatility: " + tickerWithLargestVolatility);
		System.out.println("30 Day Volatility Total: "+ largestVolatility);

	}
}
