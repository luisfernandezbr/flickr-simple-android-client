package br.com.mobiplus.flickr.rest;

import android.content.Context;

import retrofit.RequestInterceptor;

/**
 * Created by luis.fernandez on 11/5/16.
 */

public class RetrofitRequestInterceptor implements RequestInterceptor {

    private Context context;

    public RetrofitRequestInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public void intercept(RequestInterceptor.RequestFacade request) {
        request.addQueryParam("api_key", "9ec9b81e8cc2b23405687435065313ae");
        request.addQueryParam("format", "json");
        request.addQueryParam("nojsoncallback", "1");
    }
}
