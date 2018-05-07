package br.com.mobiplus.flickr.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import com.squareup.otto.Subscribe;

import br.com.mobiplus.flickr.android.activity.PhotoDetailsActivity;
import br.com.mobiplus.flickr.mvp.Events;
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
    private Activity activity;

    public HomePresenter(Activity activity) {
        this.activity = activity;
        this.initMvp();
    }

    private void initMvp() {
        this.homeView = new HomeViewImpl(this.activity);
        this.loadData(this.activity);
    }

    private void loadData(Activity activity) {
        new RetrofitFacade(activity.getApplicationContext()).requestPhotosSearch("NBA PLAYOFFS", new Callback<PhotoSearchResult>() {
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

    @Subscribe
    public void onPhotoClickedEvent(Events.OnPhotoClickedEvent event) {
        PhotoDetailsActivity.start(this.activity, event.getPhoto());
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
