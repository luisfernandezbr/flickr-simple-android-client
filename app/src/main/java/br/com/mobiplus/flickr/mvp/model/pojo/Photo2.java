
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Photo2 {

    @SerializedName("ispublic")
    @Expose
    private long ispublic;

    @SerializedName("isfriend")
    @Expose
    private long isfriend;
    @SerializedName("isfamily")
    @Expose
    private long isfamily;
    @SerializedName("id")
    @Expose
    private String id;



    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("farm")
    @Expose
    private long farm;
    @SerializedName("dateuploaded")
    @Expose
    private String dateuploaded;
    @SerializedName("isfavorite")
    @Expose
    private long isfavorite;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("safety_level")
    @Expose
    private String safetyLevel;
    @SerializedName("rotation")
    @Expose
    private long rotation;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("editability")
    @Expose
    private Editability editability;
    @SerializedName("publiceditability")
    @Expose
    private Publiceditability publiceditability;
    @SerializedName("usage")
    @Expose
    private Usage usage;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("people")
    @Expose
    private People people;
    @SerializedName("tags")
    @Expose
    private Tags tags;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("geoperms")
    @Expose
    private Geoperms geoperms;
    @SerializedName("urls")
    @Expose
    private Urls urls;
    @SerializedName("media")
    @Expose
    private String media;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("title")
    @Expose
    private String title;



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
     *     The secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     *
     * @param secret
     *     The secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     *
     * @return
     *     The server
     */
    public String getServer() {
        return server;
    }

    /**
     *
     * @param server
     *     The server
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     *
     * @return
     *     The farm
     */
    public long getFarm() {
        return farm;
    }

    /**
     *
     * @param farm
     *     The farm
     */
    public void setFarm(long farm) {
        this.farm = farm;
    }

    /**
     *
     * @return
     *     The dateuploaded
     */
    public String getDateuploaded() {
        return dateuploaded;
    }

    /**
     *
     * @param dateuploaded
     *     The dateuploaded
     */
    public void setDateuploaded(String dateuploaded) {
        this.dateuploaded = dateuploaded;
    }

    /**
     *
     * @return
     *     The isfavorite
     */
    public long getIsfavorite() {
        return isfavorite;
    }

    /**
     *
     * @param isfavorite
     *     The isfavorite
     */
    public void setIsfavorite(long isfavorite) {
        this.isfavorite = isfavorite;
    }

    /**
     *
     * @return
     *     The license
     */
    public String getLicense() {
        return license;
    }

    /**
     *
     * @param license
     *     The license
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     *
     * @return
     *     The safetyLevel
     */
    public String getSafetyLevel() {
        return safetyLevel;
    }

    /**
     *
     * @param safetyLevel
     *     The safety_level
     */
    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel;
    }

    /**
     *
     * @return
     *     The rotation
     */
    public long getRotation() {
        return rotation;
    }

    /**
     *
     * @param rotation
     *     The rotation
     */
    public void setRotation(long rotation) {
        this.rotation = rotation;
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
     *     The visibility
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     *
     * @param visibility
     *     The visibility
     */
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     *
     * @return
     *     The dates
     */
    public Dates getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     *     The dates
     */
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     *     The views
     */
    public String getViews() {
        return views;
    }

    /**
     *
     * @param views
     *     The views
     */
    public void setViews(String views) {
        this.views = views;
    }

    /**
     *
     * @return
     *     The editability
     */
    public Editability getEditability() {
        return editability;
    }

    /**
     *
     * @param editability
     *     The editability
     */
    public void setEditability(Editability editability) {
        this.editability = editability;
    }

    /**
     *
     * @return
     *     The publiceditability
     */
    public Publiceditability getPubliceditability() {
        return publiceditability;
    }

    /**
     *
     * @param publiceditability
     *     The publiceditability
     */
    public void setPubliceditability(Publiceditability publiceditability) {
        this.publiceditability = publiceditability;
    }

    /**
     *
     * @return
     *     The usage
     */
    public Usage getUsage() {
        return usage;
    }

    /**
     *
     * @param usage
     *     The usage
     */
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    /**
     *
     * @return
     *     The comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     *     The comments
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     *     The notes
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     *
     * @param notes
     *     The notes
     */
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    /**
     *
     * @return
     *     The people
     */
    public People getPeople() {
        return people;
    }

    /**
     *
     * @param people
     *     The people
     */
    public void setPeople(People people) {
        this.people = people;
    }

    /**
     *
     * @return
     *     The tags
     */
    public Tags getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     *     The tags
     */
    public void setTags(Tags tags) {
        this.tags = tags;
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
     *     The geoperms
     */
    public Geoperms getGeoperms() {
        return geoperms;
    }

    /**
     *
     * @param geoperms
     *     The geoperms
     */
    public void setGeoperms(Geoperms geoperms) {
        this.geoperms = geoperms;
    }

    /**
     *
     * @return
     *     The urls
     */
    public Urls getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     *     The urls
     */
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    /**
     *
     * @return
     *     The media
     */
    public String getMedia() {
        return media;
    }

    /**
     *
     * @param media
     *     The media
     */
    public void setMedia(String media) {
        this.media = media;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
