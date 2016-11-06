package br.com.mobiplus.flickr.mvp.view;

import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public interface PhotoDetailsView {

    void onLoadData(Photo photo);
}
