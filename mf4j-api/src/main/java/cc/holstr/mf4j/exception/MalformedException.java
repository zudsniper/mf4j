package cc.holstr.mf4j.exception;

/**
 * Created by Jason McElhenney on 4/23/17.
 * zudsniper on GitHub.
 */
public class MalformedException extends MarketRetrievalException{

	public MalformedException() {
	}

	public MalformedException(String message) {
		super(message);
	}
}
