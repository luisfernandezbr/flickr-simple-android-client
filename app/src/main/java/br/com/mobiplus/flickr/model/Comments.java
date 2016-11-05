
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Comments {

    @SerializedName("_content")
    @Expose
    private String content;

    @SerializedName("photo_id")
    @Expose
    private String photoId;

    @SerializedName("comment")
    @Expose
    private List<Comment> comment = new ArrayList<>();

    /**
     * @return The content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The _content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return The photoId
     */
    public String getPhotoId() {
        return photoId;
    }

    /**
     * @param photoId The photo_id
     */
    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    /**
     * @return The comment
     */
    public List<Comment> getComment() {
        return comment;
    }

    /**
     * @param comment The comment
     */
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

}
