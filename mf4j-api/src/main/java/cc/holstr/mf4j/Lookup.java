package cc.holstr.mf4j;

import cc.holstr.mf4j.exception.MarketRetrievalException;
import cc.holstr.mf4j.exception.UnsupportedFunctionalityException;
import cc.holstr.mf4j.impl.LookupResult;

/**
 * Created by Jason McElhenney on 4/23/17.
 * zudsniper on GitHub.
 */
public interface Lookup {

	/**
	 * The lookup method is an endpoint for those mf4j implementations that support a company lookup (namely MarkitOnDemand).
	 * @param partial String used to query the lookup api.
	 * @return
	 *
	 * @throws MarketRetrievalException if the retrieval of data is unsuccessful.
	 * @throws UnsupportedFunctionalityException if this endpoint is not implemented by the mf4j implementation being used.
	 */
	LookupResult lookup(String partial) throws MarketRetrievalException, UnsupportedFunctionalityException;
}
