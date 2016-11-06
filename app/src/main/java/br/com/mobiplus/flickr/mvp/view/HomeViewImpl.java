package br.com.mobiplus.flickr.mvp.view;

import android.app.Activity;
import android.support.annotation.IdRes;

import br.com.mobiplus.flickr.R;
import br.com.mobiplus.flickr.mvp.Events;
import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;
import br.com.mobiplus.flickr.mvp.model.pojo.v2.PhotoSearchResult;
import br.com.mobiplus.mvp.otto.BusProvider;
import br.com.mobiplus.mvp.view.BaseView;
import br.com.mobiplus.simplerecylerview.SimpleLinearRecyclerView;
import br.com.mobiplus.simplerecylerview.adapter.OnItemClickListener;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class HomeViewImpl extends BaseView implements HomeView {


    public HomeViewImpl(Activity activity) {
        super(activity);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_home;
    }

    @Override
    protected void initViews() {

    }

    @Override
    public void onLoadData(PhotoSearchResult photoSearchResult) {
        SimpleLinearRecyclerView recyclerView = (SimpleLinearRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setCollection(photoSearchResult.getPhotos().getPhoto(), new OnItemClickListener<Photo>() {

            @Override
            public void onItemClick(Photo photo, @IdRes int idViewClicked) {
                BusProvider.getInstance().post(new Events.OnPhotoClickedEvent(photo));
            }
        });
    }

    @Override
    public void onLoadDataError(int status, String message) {

    }
}
