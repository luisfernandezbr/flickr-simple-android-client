
package br.com.mobiplus.flickr.mvp.model.pojo.v2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Description implements Serializable {

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
