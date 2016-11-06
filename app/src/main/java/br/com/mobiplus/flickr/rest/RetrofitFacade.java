package br.com.mobiplus.flickr.rest;

import android.content.Context;

import com.squareup.okhttp.OkHttpClient;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import br.com.mobiplus.flickr.mvp.model.pojo.PeopleInfoResult;
import br.com.mobiplus.flickr.mvp.model.pojo.PhotoCommentsResult;
import br.com.mobiplus.flickr.mvp.model.pojo.PhotoInfoResult;
import br.com.mobiplus.flickr.mvp.model.pojo.PhotoSearchResult;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.android.AndroidLog;
import retrofit.client.OkClient;

/**
 * Created by luis.fernandez on 11/5/16.
 */

public class RetrofitFacade {

    private static final String SERVER_ENDPOINT = "https://api.flickr.com/services/rest/";

    private Context context;
    private RetrofitRequestInterceptor requestInterceptor;
    private RestAdapter gsonRestAdapter;
    private RetrofitUrlMapping service;

    public RetrofitFacade(Context context) {
        this.context = context.getApplicationContext();
        this.requestInterceptor = new RetrofitRequestInterceptor(context);

        final OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setReadTimeout(30, TimeUnit.SECONDS);
        okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);

        this.gsonRestAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(new AndroidLog("##FLICKR_CLIENT"))
                .setEndpoint(SERVER_ENDPOINT)
                .setRequestInterceptor(requestInterceptor)
                .setClient(new OkClient(okHttpClient))
                .build();

        this.service = gsonRestAdapter.create(RetrofitUrlMapping.class);
    }

    public void requestPhotosSearch(String searchTerm, Callback<PhotoSearchResult> callback) {
        String method = "flickr.photos.search";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("method", method);
        queryParams.put("tags", searchTerm);
        queryParams.put("sort","interestingness-desc");

        service.getPhotosSearch(queryParams, callback);
    }

    public void requestPhotoInfo(String photoId, Callback<PhotoInfoResult> callback) {
        String method = "flickr.photos.getInfo";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("method", method);
        queryParams.put("photo_id", photoId);

        service.getPhotosInfo(queryParams, callback);
    }

    public void requestUserInfo(String userId, Callback<PeopleInfoResult> callback) {
        String method = "flickr.people.getInfo";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("method", method);
        queryParams.put("user_id", userId);

        service.getPeopleInfo(queryParams, callback);
    }

    public void requestPhotoCommentList(String photoId, Callback<PhotoCommentsResult> callback) {
        String method = "flickr.photos.comments.getList";

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("method", method);
        queryParams.put("photo_id", photoId);

        service.getPhotoCommentList(queryParams, callback);

    }
}
