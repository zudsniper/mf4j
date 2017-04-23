package cc.holstr.mf4j.exception;

import cc.holstr.mf4j.exception.MarketRetrievalException;

/**
 * Created by Jason McElhenney on 4/21/17.
 */
public class QuandlMalformedJSONException extends MarketRetrievalException {

	public QuandlMalformedJSONException() {
		super();
	}

	public QuandlMalformedJSONException(String message) {
		super(message);
	}
}
