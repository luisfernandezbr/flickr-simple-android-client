
package br.com.mobiplus.flickr.mvp.model.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Tag {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("authorname")
    @Expose
    private String authorname;
    @SerializedName("raw")
    @Expose
    private String raw;
    @SerializedName("_content")
    @Expose
    private String content;
    @SerializedName("machine_tag")
    @Expose
    private long machineTag;

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
     *     The raw
     */
    public String getRaw() {
        return raw;
    }

    /**
     * 
     * @param raw
     *     The raw
     */
    public void setRaw(String raw) {
        this.raw = raw;
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

    /**
     * 
     * @return
     *     The machineTag
     */
    public long getMachineTag() {
        return machineTag;
    }

    /**
     * 
     * @param machineTag
     *     The machine_tag
     */
    public void setMachineTag(long machineTag) {
        this.machineTag = machineTag;
    }

}
