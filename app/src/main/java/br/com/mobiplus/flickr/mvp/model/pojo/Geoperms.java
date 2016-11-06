
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Geoperms {

    @SerializedName("ispublic")
    @Expose
    private long ispublic;
    @SerializedName("iscontact")
    @Expose
    private long iscontact;
    @SerializedName("isfriend")
    @Expose
    private long isfriend;
    @SerializedName("isfamily")
    @Expose
    private long isfamily;

    /**
     * 
     * @return
     *     The ispublic
     */
    public long getIspublic() {
        return ispublic;
    }

    /**
     * 
     * @param ispublic
     *     The ispublic
     */
    public void setIspublic(long ispublic) {
        this.ispublic = ispublic;
    }

    /**
     * 
     * @return
     *     The iscontact
     */
    public long getIscontact() {
        return iscontact;
    }

    /**
     * 
     * @param iscontact
     *     The iscontact
     */
    public void setIscontact(long iscontact) {
        this.iscontact = iscontact;
    }

    /**
     * 
     * @return
     *     The isfriend
     */
    public long getIsfriend() {
        return isfriend;
    }

    /**
     * 
     * @param isfriend
     *     The isfriend
     */
    public void setIsfriend(long isfriend) {
        this.isfriend = isfriend;
    }

    /**
     * 
     * @return
     *     The isfamily
     */
    public long getIsfamily() {
        return isfamily;
    }

    /**
     * 
     * @param isfamily
     *     The isfamily
     */
    public void setIsfamily(long isfamily) {
        this.isfamily = isfamily;
    }

}
