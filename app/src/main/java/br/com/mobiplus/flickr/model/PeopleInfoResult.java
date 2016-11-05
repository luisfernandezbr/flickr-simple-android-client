
package br.com.mobiplus.flickr.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PeopleInfoResult {

    @SerializedName("person")
    @Expose
    private Person person;
    @SerializedName("stat")
    @Expose
    private String stat;

    /**
     * 
     * @return
     *     The person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * 
     * @param person
     *     The person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * 
     * @return
     *     The stat
     */
    public String getStat() {
        return stat;
    }

    /**
     * 
     * @param stat
     *     The stat
     */
    public void setStat(String stat) {
        this.stat = stat;
    }

}
