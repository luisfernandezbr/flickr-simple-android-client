package br.com.mobiplus.flickr.rest;

import java.util.Map;

import br.com.mobiplus.flickr.model.PeopleInfoResult;
import br.com.mobiplus.flickr.model.PhotoInfoResult;
import br.com.mobiplus.flickr.model.PhotoSearchResult;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by luis.fernandez on 11/5/16.
 */

public interface RetrofitUrlMapping {

    @GET("/")
    void getPhotosSearch(@QueryMap Map<String, String> queryParams, Callback<PhotoSearchResult> callback);

    @GET("/")
    void getPhotosInfo(@QueryMap Map<String, String> queryParams, Callback<PhotoInfoResult> callback);

    @GET("/")
    void getPeopleInfo(@QueryMap Map<String, String> queryParams, Callback<PeopleInfoResult> callback);
}
