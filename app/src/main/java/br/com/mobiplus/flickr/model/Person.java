
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Person {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nsid")
    @Expose
    private String nsid;
    @SerializedName("ispro")
    @Expose
    private long ispro;
    @SerializedName("can_buy_pro")
    @Expose
    private long canBuyPro;
    @SerializedName("iconserver")
    @Expose
    private String iconserver;
    @SerializedName("iconfarm")
    @Expose
    private long iconfarm;
    @SerializedName("path_alias")
    @Expose
    private String pathAlias;
    @SerializedName("has_stats")
    @Expose
    private String hasStats;
    @SerializedName("expire")
    @Expose
    private String expire;
    @SerializedName("username")
    @Expose
    private Username username;
    @SerializedName("realname")
    @Expose
    private Realname realname;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("timezone")
    @Expose
    private Timezone timezone;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("photosurl")
    @Expose
    private Photosurl photosurl;
    @SerializedName("profileurl")
    @Expose
    private Profileurl profileurl;
    @SerializedName("mobileurl")
    @Expose
    private Mobileurl mobileurl;
    @SerializedName("photos")
    @Expose
    private Photos photos;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The nsid
     */
    public String getNsid() {
        return nsid;
    }

    /**
     * 
     * @param nsid
     *     The nsid
     */
    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    /**
     * 
     * @return
     *     The ispro
     */
    public long getIspro() {
        return ispro;
    }

    /**
     * 
     * @param ispro
     *     The ispro
     */
    public void setIspro(long ispro) {
        this.ispro = ispro;
    }

    /**
     * 
     * @return
     *     The canBuyPro
     */
    public long getCanBuyPro() {
        return canBuyPro;
    }

    /**
     * 
     * @param canBuyPro
     *     The can_buy_pro
     */
    public void setCanBuyPro(long canBuyPro) {
        this.canBuyPro = canBuyPro;
    }

    /**
     * 
     * @return
     *     The iconserver
     */
    public String getIconserver() {
        return iconserver;
    }

    /**
     * 
     * @param iconserver
     *     The iconserver
     */
    public void setIconserver(String iconserver) {
        this.iconserver = iconserver;
    }

    /**
     * 
     * @return
     *     The iconfarm
     */
    public long getIconfarm() {
        return iconfarm;
    }

    /**
     * 
     * @param iconfarm
     *     The iconfarm
     */
    public void setIconfarm(long iconfarm) {
        this.iconfarm = iconfarm;
    }

    /**
     * 
     * @return
     *     The pathAlias
     */
    public String getPathAlias() {
        return pathAlias;
    }

    /**
     * 
     * @param pathAlias
     *     The path_alias
     */
    public void setPathAlias(String pathAlias) {
        this.pathAlias = pathAlias;
    }

    /**
     * 
     * @return
     *     The hasStats
     */
    public String getHasStats() {
        return hasStats;
    }

    /**
     * 
     * @param hasStats
     *     The has_stats
     */
    public void setHasStats(String hasStats) {
        this.hasStats = hasStats;
    }

    /**
     * 
     * @return
     *     The expire
     */
    public String getExpire() {
        return expire;
    }

    /**
     * 
     * @param expire
     *     The expire
     */
    public void setExpire(String expire) {
        this.expire = expire;
    }

    /**
     * 
     * @return
     *     The username
     */
    public Username getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(Username username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The realname
     */
    public Realname getRealname() {
        return realname;
    }

    /**
     * 
     * @param realname
     *     The realname
     */
    public void setRealname(Realname realname) {
        this.realname = realname;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public Timezone getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The photosurl
     */
    public Photosurl getPhotosurl() {
        return photosurl;
    }

    /**
     * 
     * @param photosurl
     *     The photosurl
     */
    public void setPhotosurl(Photosurl photosurl) {
        this.photosurl = photosurl;
    }

    /**
     * 
     * @return
     *     The profileurl
     */
    public Profileurl getProfileurl() {
        return profileurl;
    }

    /**
     * 
     * @param profileurl
     *     The profileurl
     */
    public void setProfileurl(Profileurl profileurl) {
        this.profileurl = profileurl;
    }

    /**
     * 
     * @return
     *     The mobileurl
     */
    public Mobileurl getMobileurl() {
        return mobileurl;
    }

    /**
     * 
     * @param mobileurl
     *     The mobileurl
     */
    public void setMobileurl(Mobileurl mobileurl) {
        this.mobileurl = mobileurl;
    }

    /**
     * 
     * @return
     *     The photos
     */
    public Photos getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

}
