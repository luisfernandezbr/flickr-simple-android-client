
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Note {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("authorname")
    @Expose
    private String authorname;
    @SerializedName("authorrealname")
    @Expose
    private String authorrealname;
    @SerializedName("authorispro")
    @Expose
    private long authorispro;
    @SerializedName("x")
    @Expose
    private String x;
    @SerializedName("y")
    @Expose
    private String y;
    @SerializedName("w")
    @Expose
    private String w;
    @SerializedName("h")
    @Expose
    private String h;
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
     *     The authorrealname
     */
    public String getAuthorrealname() {
        return authorrealname;
    }

    /**
     * 
     * @param authorrealname
     *     The authorrealname
     */
    public void setAuthorrealname(String authorrealname) {
        this.authorrealname = authorrealname;
    }

    /**
     * 
     * @return
     *     The authorispro
     */
    public long getAuthorispro() {
        return authorispro;
    }

    /**
     * 
     * @param authorispro
     *     The authorispro
     */
    public void setAuthorispro(long authorispro) {
        this.authorispro = authorispro;
    }

    /**
     * 
     * @return
     *     The x
     */
    public String getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    public void setX(String x) {
        this.x = x;
    }

    /**
     * 
     * @return
     *     The y
     */
    public String getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    public void setY(String y) {
        this.y = y;
    }

    /**
     * 
     * @return
     *     The w
     */
    public String getW() {
        return w;
    }

    /**
     * 
     * @param w
     *     The w
     */
    public void setW(String w) {
        this.w = w;
    }

    /**
     * 
     * @return
     *     The h
     */
    public String getH() {
        return h;
    }

    /**
     * 
     * @param h
     *     The h
     */
    public void setH(String h) {
        this.h = h;
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
