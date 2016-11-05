
package br.com.mobiplus.flickr.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Photos {

    @SerializedName("page")
    @Expose
    private long page;
    @SerializedName("pages")
    @Expose
    private long pages;
    @SerializedName("perpage")
    @Expose
    private long perpage;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("photo")
    @Expose
    private List<Photo> photo = new ArrayList<Photo>();

    /**
     * 
     * @return
     *     The page
     */
    public long getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(long page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The pages
     */
    public long getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    public void setPages(long pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return
     *     The perpage
     */
    public long getPerpage() {
        return perpage;
    }

    /**
     * 
     * @param perpage
     *     The perpage
     */
    public void setPerpage(long perpage) {
        this.perpage = perpage;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The photo
     */
    public List<Photo> getPhoto() {
        return photo;
    }

    /**
     * 
     * @param photo
     *     The photo
     */
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

}
