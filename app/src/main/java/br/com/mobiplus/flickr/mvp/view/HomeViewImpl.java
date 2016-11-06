package br.com.mobiplus.flickr.mvp.view;

import android.app.Activity;

import br.com.mobiplus.flickr.R;
import br.com.mobiplus.flickr.mvp.model.pojo.PhotoSearchResult;
import br.com.mobiplus.mvp.view.BaseView;

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

    }
}
