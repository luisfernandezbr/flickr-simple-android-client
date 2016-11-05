
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Editability {

    @SerializedName("cancomment")
    @Expose
    private long cancomment;
    @SerializedName("canaddmeta")
    @Expose
    private long canaddmeta;

    /**
     * 
     * @return
     *     The cancomment
     */
    public long getCancomment() {
        return cancomment;
    }

    /**
     * 
     * @param cancomment
     *     The cancomment
     */
    public void setCancomment(long cancomment) {
        this.cancomment = cancomment;
    }

    /**
     * 
     * @return
     *     The canaddmeta
     */
    public long getCanaddmeta() {
        return canaddmeta;
    }

    /**
     * 
     * @param canaddmeta
     *     The canaddmeta
     */
    public void setCanaddmeta(long canaddmeta) {
        this.canaddmeta = canaddmeta;
    }

}
