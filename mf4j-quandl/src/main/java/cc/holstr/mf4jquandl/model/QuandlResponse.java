
package cc.holstr.mf4jquandl.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class QuandlResponse {

	@SerializedName("dataset")
	@Expose
	private Dataset dataset;

	/**
	 * @return The dataset
	 */
	public Dataset getDataset() {
		return dataset;
	}

	/**
	 * @param dataset The dataset
	 */
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

}
