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
        request.addQueryParam("api_key", "6d19c35b9bcd252232706b369ddbd27f");
        request.addQueryParam("format", "json");
        request.addQueryParam("nojsoncallback", "1");
    }
}
