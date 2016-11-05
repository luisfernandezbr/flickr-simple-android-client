
package br.com.mobiplus.flickr.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


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
    @SerializedName("firstdatetaken")
    @Expose
    private Firstdatetaken firstdatetaken;
    @SerializedName("firstdate")
    @Expose
    private Firstdate firstdate;
    @SerializedName("count")
    @Expose
    private Count count;

    /**
     * @return The page
     */
    public long getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(long page) {
        this.page = page;
    }

    /**
     * @return The pages
     */
    public long getPages() {
        return pages;
    }

    /**
     * @param pages The pages
     */
    public void setPages(long pages) {
        this.pages = pages;
    }

    /**
     * @return The perpage
     */
    public long getPerpage() {
        return perpage;
    }

    /**
     * @param perpage The perpage
     */
    public void setPerpage(long perpage) {
        this.perpage = perpage;
    }

    /**
     * @return The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return The photo
     */
    public List<Photo> getPhoto() {
        return photo;
    }

    /**
     * @param photo The photo
     */
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    /**
     * @return The firstdatetaken
     */
    public Firstdatetaken getFirstdatetaken() {
        return firstdatetaken;
    }

    /**
     * @param firstdatetaken The firstdatetaken
     */
    public void setFirstdatetaken(Firstdatetaken firstdatetaken) {
        this.firstdatetaken = firstdatetaken;
    }

    /**
     * @return The firstdate
     */
    public Firstdate getFirstdate() {
        return firstdate;
    }

    /**
     * @param firstdate The firstdate
     */
    public void setFirstdate(Firstdate firstdate) {
        this.firstdate = firstdate;
    }

    /**
     * @return The count
     */
    public Count getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(Count count) {
        this.count = count;
    }


}
