
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Usage {

    @SerializedName("candownload")
    @Expose
    private long candownload;
    @SerializedName("canblog")
    @Expose
    private long canblog;
    @SerializedName("canprint")
    @Expose
    private long canprint;
    @SerializedName("canshare")
    @Expose
    private long canshare;

    /**
     * 
     * @return
     *     The candownload
     */
    public long getCandownload() {
        return candownload;
    }

    /**
     * 
     * @param candownload
     *     The candownload
     */
    public void setCandownload(long candownload) {
        this.candownload = candownload;
    }

    /**
     * 
     * @return
     *     The canblog
     */
    public long getCanblog() {
        return canblog;
    }

    /**
     * 
     * @param canblog
     *     The canblog
     */
    public void setCanblog(long canblog) {
        this.canblog = canblog;
    }

    /**
     * 
     * @return
     *     The canprint
     */
    public long getCanprint() {
        return canprint;
    }

    /**
     * 
     * @param canprint
     *     The canprint
     */
    public void setCanprint(long canprint) {
        this.canprint = canprint;
    }

    /**
     * 
     * @return
     *     The canshare
     */
    public long getCanshare() {
        return canshare;
    }

    /**
     * 
     * @param canshare
     *     The canshare
     */
    public void setCanshare(long canshare) {
        this.canshare = canshare;
    }

}
