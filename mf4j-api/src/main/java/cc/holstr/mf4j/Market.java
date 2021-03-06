package cc.holstr.mf4j;

import cc.holstr.mf4j.exception.MarketRetrievalException;
import cc.holstr.mf4j.impl.MarketResult;
import cc.holstr.mf4j.impl.MarketResults;

import java.time.ZonedDateTime;

/**
 * Created by Jason McElhenney on 4/21/17.
 * zudsniper on GitHub.
 */

public interface Market {

	/**
	 * @param ticker the stock ticker being queried.
	 *
	 * @return A MarketResult object containing today's information on the given ticker.
	 */
	MarketResult ticker(String ticker) throws MarketRetrievalException;

	/**
	 * @param ticker   the stock ticker being queried.
	 * @param dateTime dateTime specifying the date on which to retrieve data.
	 *
	 * @return A MarketResult object containing the specified date's information on the given ticker.
	 */
	MarketResult ticker(String ticker, ZonedDateTime dateTime) throws MarketRetrievalException;

	/**
	 * @param ticker         the stock ticker being queried.
	 * @param startInclusive starting date for the query.
	 * @param endInclusive   the ending date for the query.
	 *
	 * @return MarketResults object containing a list of MarketResults in the specified boundaries.
	 */
	MarketResults ticker(String ticker, ZonedDateTime startInclusive, ZonedDateTime endInclusive) throws MarketRetrievalException;
}
