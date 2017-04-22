package cc.holstr.mf4j.impl;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * Created by Jason McElhenney on 4/21/17.
 */
public class MarketResult {
	private ZonedDateTime timestamp;
	private String ticker;

	private BigDecimal marketCap;
	private BigDecimal volume;
	private BigDecimal adjustedVolume;
	
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

	public MarketResult(ZonedDateTime timestamp, String ticker, BigDecimal marketCap, BigDecimal volume, BigDecimal adjustedVolume, double high, double low, double open, double close, double adjustedHigh, double adjustedLow, double adjustedOpen, double adjustedClose, double exDividend, double splitRatio) {
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

	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public BigDecimal getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(BigDecimal marketCap) {
		this.marketCap = marketCap;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getAdjustedVolume() {
		return adjustedVolume;
	}

	public void setAdjustedVolume(BigDecimal adjustedVolume) {
		this.adjustedVolume = adjustedVolume;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getAdjustedHigh() {
		return adjustedHigh;
	}

	public void setAdjustedHigh(double adjustedHigh) {
		this.adjustedHigh = adjustedHigh;
	}

	public double getAdjustedLow() {
		return adjustedLow;
	}

	public void setAdjustedLow(double adjustedLow) {
		this.adjustedLow = adjustedLow;
	}

	public double getAdjustedOpen() {
		return adjustedOpen;
	}

	public void setAdjustedOpen(double adjustedOpen) {
		this.adjustedOpen = adjustedOpen;
	}

	public double getAdjustedClose() {
		return adjustedClose;
	}

	public void setAdjustedClose(double adjustedClose) {
		this.adjustedClose = adjustedClose;
	}

	public double getExDividend() {
		return exDividend;
	}

	public void setExDividend(double exDividend) {
		this.exDividend = exDividend;
	}

	public double getSplitRatio() {
		return splitRatio;
	}

	public void setSplitRatio(double splitRatio) {
		this.splitRatio = splitRatio;
	}
}
