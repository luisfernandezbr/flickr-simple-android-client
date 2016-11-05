
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Comment {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("author_is_deleted")
    @Expose
    private long authorIsDeleted;
    @SerializedName("authorname")
    @Expose
    private String authorname;
    @SerializedName("iconserver")
    @Expose
    private String iconserver;
    @SerializedName("iconfarm")
    @Expose
    private long iconfarm;
    @SerializedName("datecreate")
    @Expose
    private String datecreate;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("path_alias")
    @Expose
    private String pathAlias;
    @SerializedName("realname")
    @Expose
    private String realname;
    @SerializedName("_content")
    @Expose
    private String content;

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
     *     The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The authorIsDeleted
     */
    public long getAuthorIsDeleted() {
        return authorIsDeleted;
    }

    /**
     * 
     * @param authorIsDeleted
     *     The author_is_deleted
     */
    public void setAuthorIsDeleted(long authorIsDeleted) {
        this.authorIsDeleted = authorIsDeleted;
    }

    /**
     * 
     * @return
     *     The authorname
     */
    public String getAuthorname() {
        return authorname;
    }

    /**
     * 
     * @param authorname
     *     The authorname
     */
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
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
     *     The datecreate
     */
    public String getDatecreate() {
        return datecreate;
    }

    /**
     * 
     * @param datecreate
     *     The datecreate
     */
    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

    /**
     * 
     * @return
     *     The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     * @param permalink
     *     The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
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
     *     The realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 
     * @param realname
     *     The realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The _content
     */
    public void setContent(String content) {
        this.content = content;
    }

}
