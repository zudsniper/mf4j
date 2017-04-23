package cc.holstr.mf4j.impl;

/**
 * Created by Jason McElhenney on 4/23/17.
 * zudsniper on GitHub.
 */
public class LookupResult {
	private String ticker;
	private String name;
	private String exchange;

	public LookupResult(String ticker) {
		this.ticker = ticker;
	}

	public LookupResult(String ticker, String name, String exchange) {
		this.ticker = ticker;
		this.name = name;
		this.exchange = exchange;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
}
