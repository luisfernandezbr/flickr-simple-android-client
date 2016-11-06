package br.com.mobiplus.flickr.mvp.presenter;

import android.app.Activity;
import android.content.Intent;

import com.squareup.otto.Subscribe;

import br.com.mobiplus.flickr.android.activity.PhotoViewActivity;
import br.com.mobiplus.flickr.mvp.Events;
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

    private Activity activity;

    public PhotoDetailsPresenter(Activity activity, Photo photo) {
        this.activity = activity;
        this.photo = photo;
        this.initMvp();
    }

    private void initMvp() {
        this.view = new PhotoDetailsViewImpl(this.activity);
        this.loadData();
    }

    private void loadData() {
        view.onLoadData(photo);
    }

    @Subscribe
    public void OnPhotoDetailClickedEvent(Events.OnPhotoDetailClickedEvent event) {
        PhotoViewActivity.start(this.activity, event.getPhoto());
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
