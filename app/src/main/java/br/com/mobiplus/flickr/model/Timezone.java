
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Timezone {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("timezone_id")
    @Expose
    private String timezoneId;

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The offset
     */
    public String getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The timezoneId
     */
    public String getTimezoneId() {
        return timezoneId;
    }

    /**
     * 
     * @param timezoneId
     *     The timezone_id
     */
    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

}
