package cc.holstr.mf4j.impl;

import java.time.ZonedDateTime;

/**
 * Created by Jason McElhenney on 4/21/17.
 */
public class MarketResult {
	private ZonedDateTime timestamp;
	private String ticker;

	private long marketCap;
	private long volume;
	private long adjustedVolume; 
	
	private double high; 
	private double low; 
	private double open; 
	private double close;

	private double adjustedHigh;
	private double adjustedLow;
	private double adjustedOpen;
	private double adjustedClose;

	private double exDividend;
	private double splitRatio;

	public MarketResult() {
	}

	public MarketResult(ZonedDateTime timestamp, String ticker, long marketCap, long volume, long adjustedVolume, double high, double low, double open, double close, double adjustedHigh, double adjustedLow, double adjustedOpen, double adjustedClose, double exDividend, double splitRatio) {
		this.timestamp = timestamp;
		this.ticker = ticker;
		this.marketCap = marketCap;
		this.volume = volume;
		this.adjustedVolume = adjustedVolume;
		this.high = high;
		this.low = low;
		this.open = open;
		this.close = close;
		this.adjustedHigh = adjustedHigh;
		this.adjustedLow = adjustedLow;
		this.adjustedOpen = adjustedOpen;
		this.adjustedClose = adjustedClose;
		this.exDividend = exDividend;
		this.splitRatio = splitRatio;
	}

	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	public String getTicker() {
		return ticker;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public long getVolume() {
		return volume;
	}

	public long getAdjustedVolume() {
		return adjustedVolume;
	}

	public double getHigh() {
		return high;
	}

	public double getLow() {
		return low;
	}

	public double getOpen() {
		return open;
	}

	public double getClose() {
		return close;
	}

	public double getAdjustedHigh() {
		return adjustedHigh;
	}

	public double getAdjustedLow() {
		return adjustedLow;
	}

	public double getAdjustedOpen() {
		return adjustedOpen;
	}

	public double getAdjustedClose() {
		return adjustedClose;
	}

	public double getExDividend() {
		return exDividend;
	}

	public double getSplitRatio() {
		return splitRatio;
	}

	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public void setAdjustedVolume(long adjustedVolume) {
		this.adjustedVolume = adjustedVolume;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public void setAdjustedHigh(double adjustedHigh) {
		this.adjustedHigh = adjustedHigh;
	}

	public void setAdjustedLow(double adjustedLow) {
		this.adjustedLow = adjustedLow;
	}

	public void setAdjustedOpen(double adjustedOpen) {
		this.adjustedOpen = adjustedOpen;
	}

	public void setAdjustedClose(double adjustedClose) {
		this.adjustedClose = adjustedClose;
	}

	public void setExDividend(double exDividend) {
		this.exDividend = exDividend;
	}

	public void setSplitRatio(double splitRatio) {
		this.splitRatio = splitRatio;
	}
}
