
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Count {

    @SerializedName("_content")
    @Expose
    private long content;

    /**
     * 
     * @return
     *     The content
     */
    public long getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The _content
     */
    public void setContent(long content) {
        this.content = content;
    }

}
