
package br.com.mobiplus.flickr.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Notes {

    @SerializedName("note")
    @Expose
    private List<Note> note = new ArrayList<Note>();

    /**
     * 
     * @return
     *     The note
     */
    public List<Note> getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    public void setNote(List<Note> note) {
        this.note = note;
    }

}
