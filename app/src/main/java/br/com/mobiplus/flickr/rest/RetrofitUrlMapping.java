package br.com.mobiplus.flickr.rest;

import java.util.Map;

import br.com.mobiplus.flickr.model.PhotoSearchResult;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by luis.fernandez on 11/5/16.
 */

public interface RetrofitUrlMapping {

    @GET("/")
    void getPhotosSearch(@QueryMap Map<String, String> options, Callback<PhotoSearchResult> callback);
}
