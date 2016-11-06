package br.com.mobiplus.flickr.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;
import br.com.mobiplus.flickr.mvp.view.PhotoDetailsView;
import br.com.mobiplus.flickr.mvp.view.PhotoDetailsViewImpl;
import br.com.mobiplus.mvp.BasePresenter;
import br.com.mobiplus.mvp.otto.BusProvider;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class PhotoDetailsPresenter extends BasePresenter {

    private final Photo photo;
    private PhotoDetailsView view;

    public PhotoDetailsPresenter(Activity activity, Photo photo) {
        this.photo = photo;
        this.initMvp(activity);
    }

    private void initMvp(Activity activity) {
        this.view = new PhotoDetailsViewImpl(activity);
        this.loadData(activity);
    }

    private void loadData(Activity activity) {
        view.onLoadData(photo);
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
