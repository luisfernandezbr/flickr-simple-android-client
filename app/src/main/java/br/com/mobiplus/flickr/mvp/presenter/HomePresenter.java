package br.com.mobiplus.flickr.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import br.com.mobiplus.flickr.mvp.view.HomeView;
import br.com.mobiplus.flickr.mvp.view.HomeViewImpl;
import br.com.mobiplus.mvp.BasePresenter;
import br.com.mobiplus.mvp.otto.BusProvider;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class HomePresenter extends BasePresenter {

    private HomeView homeView;

    public HomePresenter(Activity activity) {
        this.homeView = new HomeViewImpl(activity);
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
