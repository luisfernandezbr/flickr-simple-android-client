package br.com.mobiplus.flickr.mvp.view;

import android.app.Activity;
import android.support.annotation.IdRes;

import br.com.mobiplus.flickr.R;
import br.com.mobiplus.flickr.mvp.model.pojo.Photo2;
import br.com.mobiplus.flickr.mvp.model.pojo.PhotoSearchResult;
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
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {

    }

    @Override
    public void onLoadData(PhotoSearchResult photoSearchResult) {
        SimpleLinearRecyclerView recyclerView = (SimpleLinearRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setCollection(photoSearchResult.getPhotos().getPhoto(), new OnItemClickListener<Photo2>() {

            @Override
            public void onItemClick(Photo2 photo, @IdRes int idViewClicked) {

            }
        });
    }
}
