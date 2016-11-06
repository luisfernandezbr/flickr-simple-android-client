
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class People {

    @SerializedName("haspeople")
    @Expose
    private long haspeople;

    /**
     * 
     * @return
     *     The haspeople
     */
    public long getHaspeople() {
        return haspeople;
    }

    /**
     * 
     * @param haspeople
     *     The haspeople
     */
    public void setHaspeople(long haspeople) {
        this.haspeople = haspeople;
    }

}
