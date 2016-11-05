
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Photos {

    @SerializedName("firstdatetaken")
    @Expose
    private Firstdatetaken firstdatetaken;
    @SerializedName("firstdate")
    @Expose
    private Firstdate firstdate;
    @SerializedName("count")
    @Expose
    private Count count;

    /**
     * 
     * @return
     *     The firstdatetaken
     */
    public Firstdatetaken getFirstdatetaken() {
        return firstdatetaken;
    }

    /**
     * 
     * @param firstdatetaken
     *     The firstdatetaken
     */
    public void setFirstdatetaken(Firstdatetaken firstdatetaken) {
        this.firstdatetaken = firstdatetaken;
    }

    /**
     * 
     * @return
     *     The firstdate
     */
    public Firstdate getFirstdate() {
        return firstdate;
    }

    /**
     * 
     * @param firstdate
     *     The firstdate
     */
    public void setFirstdate(Firstdate firstdate) {
        this.firstdate = firstdate;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Count getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Count count) {
        this.count = count;
    }

}
