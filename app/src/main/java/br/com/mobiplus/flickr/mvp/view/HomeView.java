package br.com.mobiplus.flickr.mvp.view;

import br.com.mobiplus.flickr.mvp.model.pojo.PhotoSearchResult;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public interface HomeView {

    void onLoadData(PhotoSearchResult photoSearchResult);
}
