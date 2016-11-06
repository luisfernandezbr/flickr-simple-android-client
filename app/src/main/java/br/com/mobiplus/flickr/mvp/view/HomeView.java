package br.com.mobiplus.flickr.mvp.view;

import br.com.mobiplus.flickr.mvp.model.pojo.v2.PhotoSearchResult;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public interface HomeView {

    void onLoadData(PhotoSearchResult photoSearchResult);

    void onLoadDataError(int status, String message);
}
