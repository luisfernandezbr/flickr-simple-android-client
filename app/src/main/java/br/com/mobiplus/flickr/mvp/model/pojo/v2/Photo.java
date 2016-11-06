package br.com.mobiplus.flickr.mvp.model.pojo.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import br.com.mobiplus.flickr.R;
import br.com.mobiplus.simplerecylerview.annotations.ImageAdapter;
import br.com.mobiplus.simplerecylerview.annotations.LayoutAdapter;
import br.com.mobiplus.simplerecylerview.annotations.TextAdapter;

/**
 * Created by luis.fernandez on 11/6/16.
 */
@LayoutAdapter(layoutResId = R.layout.item_home_photo_list)
public class Photo implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private int farm;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("ispublic")
    @Expose
    private int ispublic;
    @SerializedName("isfriend")
    @Expose
    private int isfriend;
    @SerializedName("isfamily")
    @Expose
    private int isfamily;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("o_width")
    @Expose
    private String oWidth;
    @SerializedName("o_height")
    @Expose
    private String oHeight;
    @SerializedName("dateupload")
    @Expose
    private String dateupload;
    @SerializedName("lastupdate")
    @Expose
    private String lastupdate;
    @SerializedName("datetaken")
    @Expose
    private String datetaken;
    @SerializedName("datetakengranularity")
    @Expose
    private String datetakengranularity;
    @SerializedName("datetakenunknown")
    @Expose
    private String datetakenunknown;
    @SerializedName("ownername")
    @Expose
    private String ownername;
    @SerializedName("iconserver")
    @Expose
    private String iconserver;
    @SerializedName("iconfarm")
    @Expose
    private int iconfarm;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("originalsecret")
    @Expose
    private String originalsecret;
    @SerializedName("originalformat")
    @Expose
    private String originalformat;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("accuracy")
    @Expose
    private String accuracy;
    @SerializedName("context")
    @Expose
    private int context;
    @SerializedName("media")
    @Expose
    private String media;
    @SerializedName("media_status")
    @Expose
    private String mediaStatus;
    @SerializedName("url_t")
    @Expose
    private String urlT;
    @SerializedName("height_t")
    @Expose
    private String heightT;
    @SerializedName("width_t")
    @Expose
    private String widthT;
    @SerializedName("url_m")
    @Expose
    private String urlM;
    @SerializedName("height_m")
    @Expose
    private String heightM;
    @SerializedName("width_m")
    @Expose
    private String widthM;
    @SerializedName("url_l")
    @Expose
    private String urlL;
    @SerializedName("height_l")
    @Expose
    private String heightL;
    @SerializedName("width_l")
    @Expose
    private String widthL;
    @SerializedName("url_o")
    @Expose
    private String urlO;
    @SerializedName("height_o")
    @Expose
    private String heightO;
    @SerializedName("width_o")
    @Expose
    private String widthO;
    @SerializedName("pathalias")
    @Expose
    private String pathalias;
    @SerializedName("place_id")
    @Expose
    private String placeId;
    @SerializedName("woeid")
    @Expose
    private String woeid;
    @SerializedName("geo_is_family")
    @Expose
    private int geoIsFamily;
    @SerializedName("geo_is_friend")
    @Expose
    private int geoIsFriend;
    @SerializedName("geo_is_contact")
    @Expose
    private int geoIsContact;
    @SerializedName("geo_is_public")
    @Expose
    private int geoIsPublic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    @TextAdapter(resId = R.id.textDescription)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIspublic() {
        return ispublic;
    }

    public void setIspublic(int ispublic) {
        this.ispublic = ispublic;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(int isfriend) {
        this.isfriend = isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(int isfamily) {
        this.isfamily = isfamily;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getoWidth() {
        return oWidth;
    }

    public void setoWidth(String oWidth) {
        this.oWidth = oWidth;
    }

    public String getoHeight() {
        return oHeight;
    }

    public void setoHeight(String oHeight) {
        this.oHeight = oHeight;
    }

    public String getDateupload() {
        return dateupload;
    }

    public void setDateupload(String dateupload) {
        this.dateupload = dateupload;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getDatetaken() {
        return datetaken;
    }

    public void setDatetaken(String datetaken) {
        this.datetaken = datetaken;
    }

    public String getDatetakengranularity() {
        return datetakengranularity;
    }

    public void setDatetakengranularity(String datetakengranularity) {
        this.datetakengranularity = datetakengranularity;
    }

    public String getDatetakenunknown() {
        return datetakenunknown;
    }

    public void setDatetakenunknown(String datetakenunknown) {
        this.datetakenunknown = datetakenunknown;
    }

    @TextAdapter(resId = R.id.textTitle)
    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getIconserver() {
        return iconserver;
    }

    public void setIconserver(String iconserver) {
        this.iconserver = iconserver;
    }

    public int getIconfarm() {
        return iconfarm;
    }

    public void setIconfarm(int iconfarm) {
        this.iconfarm = iconfarm;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getOriginalsecret() {
        return originalsecret;
    }

    public void setOriginalsecret(String originalsecret) {
        this.originalsecret = originalsecret;
    }

    public String getOriginalformat() {
        return originalformat;
    }

    public void setOriginalformat(String originalformat) {
        this.originalformat = originalformat;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public int getContext() {
        return context;
    }

    public void setContext(int context) {
        this.context = context;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMediaStatus() {
        return mediaStatus;
    }

    public void setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
    }

    public String getUrlT() {
        return urlT;
    }

    public void setUrlT(String urlT) {
        this.urlT = urlT;
    }

    public String getHeightT() {
        return heightT;
    }

    public void setHeightT(String heightT) {
        this.heightT = heightT;
    }

    public String getWidthT() {
        return widthT;
    }

    public void setWidthT(String widthT) {
        this.widthT = widthT;
    }

    public String getUrlM() {
        return urlM;
    }

    public void setUrlM(String urlM) {
        this.urlM = urlM;
    }

    public String getHeightM() {
        return heightM;
    }

    public void setHeightM(String heightM) {
        this.heightM = heightM;
    }

    public String getWidthM() {
        return widthM;
    }

    public void setWidthM(String widthM) {
        this.widthM = widthM;
    }

    @ImageAdapter(resId = R.id.imageBanner)
    public String getUrlL() {
        return urlL;
    }

    public void setUrlL(String urlL) {
        this.urlL = urlL;
    }

    public String getHeightL() {
        return heightL;
    }

    public void setHeightL(String heightL) {
        this.heightL = heightL;
    }

    public String getWidthL() {
        return widthL;
    }

    public void setWidthL(String widthL) {
        this.widthL = widthL;
    }

    public String getUrlO() {
        return urlO;
    }

    public void setUrlO(String urlO) {
        this.urlO = urlO;
    }

    public String getHeightO() {
        return heightO;
    }

    public void setHeightO(String heightO) {
        this.heightO = heightO;
    }

    public String getWidthO() {
        return widthO;
    }

    public void setWidthO(String widthO) {
        this.widthO = widthO;
    }

    public String getPathalias() {
        return pathalias;
    }

    public void setPathalias(String pathalias) {
        this.pathalias = pathalias;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public int getGeoIsFamily() {
        return geoIsFamily;
    }

    public void setGeoIsFamily(int geoIsFamily) {
        this.geoIsFamily = geoIsFamily;
    }

    public int getGeoIsFriend() {
        return geoIsFriend;
    }

    public void setGeoIsFriend(int geoIsFriend) {
        this.geoIsFriend = geoIsFriend;
    }

    public int getGeoIsContact() {
        return geoIsContact;
    }

    public void setGeoIsContact(int geoIsContact) {
        this.geoIsContact = geoIsContact;
    }

    public int getGeoIsPublic() {
        return geoIsPublic;
    }

    public void setGeoIsPublic(int geoIsPublic) {
        this.geoIsPublic = geoIsPublic;
    }

    @ImageAdapter(resId = R.id.imageAvatar)
    public String getAvatarUrl() {
        return String.format("http://farm%s.staticflickr.com/%s/buddyicons/%s.jpg", iconfarm, iconserver, owner);
    }
}
