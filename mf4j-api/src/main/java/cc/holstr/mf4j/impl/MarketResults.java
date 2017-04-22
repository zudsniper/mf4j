package cc.holstr.mf4j.impl;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jason McElhenney on 4/21/17.
 */
public class MarketResults extends ArrayList<MarketResult> {

	/**
	 * @return A HashMap with ZonedDateTime keys and MarketResult values compiled from the superclass ArrayList of MarketResults.
	 */
	//TODO: finish impl
	public HashMap<ZonedDateTime, MarketResult> toMap() {
		return null;
	}
}
