
package cc.holstr.mf4j.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Dataset {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("dataset_code")
    @Expose
    private String datasetCode;
    @SerializedName("database_code")
    @Expose
    private String databaseCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("refreshed_at")
    @Expose
    private String refreshedAt;
    @SerializedName("newest_available_date")
    @Expose
    private String newestAvailableDate;
    @SerializedName("oldest_available_date")
    @Expose
    private String oldestAvailableDate;
    @SerializedName("column_names")
    @Expose
    private List<String> columnNames = new ArrayList<String>();
    @SerializedName("frequency")
    @Expose
    private String frequency;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("premium")
    @Expose
    private boolean premium;
    @SerializedName("limit")
    @Expose
    private Object limit;
    @SerializedName("transform")
    @Expose
    private Object transform;
    @SerializedName("column_index")
    @Expose
    private Object columnIndex;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("data")
    @Expose
    private List<List<String>> data = new ArrayList<List<String>>();
    @SerializedName("collapse")
    @Expose
    private Object collapse;
    @SerializedName("order")
    @Expose
    private Object order;
    @SerializedName("database_id")
    @Expose
    private int databaseId;

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The datasetCode
     */
    public String getDatasetCode() {
        return datasetCode;
    }

    /**
     * 
     * @param datasetCode
     *     The dataset_code
     */
    public void setDatasetCode(String datasetCode) {
        this.datasetCode = datasetCode;
    }

    /**
     * 
     * @return
     *     The databaseCode
     */
    public String getDatabaseCode() {
        return databaseCode;
    }

    /**
     * 
     * @param databaseCode
     *     The database_code
     */
    public void setDatabaseCode(String databaseCode) {
        this.databaseCode = databaseCode;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The refreshedAt
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    /**
     * 
     * @param refreshedAt
     *     The refreshed_at
     */
    public void setRefreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * 
     * @return
     *     The newestAvailableDate
     */
    public String getNewestAvailableDate() {
        return newestAvailableDate;
    }

    /**
     * 
     * @param newestAvailableDate
     *     The newest_available_date
     */
    public void setNewestAvailableDate(String newestAvailableDate) {
        this.newestAvailableDate = newestAvailableDate;
    }

    /**
     * 
     * @return
     *     The oldestAvailableDate
     */
    public String getOldestAvailableDate() {
        return oldestAvailableDate;
    }

    /**
     * 
     * @param oldestAvailableDate
     *     The oldest_available_date
     */
    public void setOldestAvailableDate(String oldestAvailableDate) {
        this.oldestAvailableDate = oldestAvailableDate;
    }

    /**
     * 
     * @return
     *     The columnNames
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames
     *     The column_names
     */
    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    /**
     * 
     * @return
     *     The frequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The premium
     */
    public boolean isPremium() {
        return premium;
    }

    /**
     * 
     * @param premium
     *     The premium
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    /**
     * 
     * @return
     *     The limit
     */
    public Object getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    public void setLimit(Object limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The transform
     */
    public Object getTransform() {
        return transform;
    }

    /**
     * 
     * @param transform
     *     The transform
     */
    public void setTransform(Object transform) {
        this.transform = transform;
    }

    /**
     * 
     * @return
     *     The columnIndex
     */
    public Object getColumnIndex() {
        return columnIndex;
    }

    /**
     * 
     * @param columnIndex
     *     The column_index
     */
    public void setColumnIndex(Object columnIndex) {
        this.columnIndex = columnIndex;
    }

    /**
     * 
     * @return
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<List<String>> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<List<String>> data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The collapse
     */
    public Object getCollapse() {
        return collapse;
    }

    /**
     * 
     * @param collapse
     *     The collapse
     */
    public void setCollapse(Object collapse) {
        this.collapse = collapse;
    }

    /**
     * 
     * @return
     *     The order
     */
    public Object getOrder() {
        return order;
    }

    /**
     * 
     * @param order
     *     The order
     */
    public void setOrder(Object order) {
        this.order = order;
    }

    /**
     * 
     * @return
     *     The databaseId
     */
    public int getDatabaseId() {
        return databaseId;
    }

    /**
     * 
     * @param databaseId
     *     The database_id
     */
    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

}
