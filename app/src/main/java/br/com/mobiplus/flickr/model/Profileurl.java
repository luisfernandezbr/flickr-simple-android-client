
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Profileurl {

    @SerializedName("_content")
    @Expose
    private String content;

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
