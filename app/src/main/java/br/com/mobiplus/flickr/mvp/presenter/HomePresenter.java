package br.com.mobiplus.flickr.mvp.presenter;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import br.com.mobiplus.flickr.MainActivity;
import br.com.mobiplus.flickr.mvp.model.pojo.v2.PhotoSearchResult;
import br.com.mobiplus.flickr.mvp.view.HomeView;
import br.com.mobiplus.flickr.mvp.view.HomeViewImpl;
import br.com.mobiplus.flickr.rest.RetrofitFacade;
import br.com.mobiplus.mvp.BasePresenter;
import br.com.mobiplus.mvp.otto.BusProvider;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class HomePresenter extends BasePresenter {

    private HomeView homeView;

    public HomePresenter(Activity activity) {
        this.initMvp(activity);
    }

    private void initMvp(Activity activity) {
        this.homeView = new HomeViewImpl(activity);
        this.loadData(activity);
    }

    private void loadData(Activity activity) {
        new RetrofitFacade(activity.getApplicationContext()).requestPhotosSearch("nfl", new Callback<PhotoSearchResult>() {
            @Override
            public void success(PhotoSearchResult photoSearchResult, Response response) {
                homeView.onLoadData(photoSearchResult);
            }

            @Override
            public void failure(RetrofitError error) {
                homeView.onLoadDataError(error.getResponse().getStatus(), error.getMessage());
            }
        });
    }

    @Override
    public void onStart() {
        BusProvider.getInstance().register(this);
    }

    @Override
    public void onStop() {
        BusProvider.getInstance().unregister(this);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}
