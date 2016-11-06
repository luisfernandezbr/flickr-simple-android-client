package br.com.mobiplus.flickr.mvp;

import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class Events {

    public static class OnPhotoClickedEvent {

        private Photo photo;

        public OnPhotoClickedEvent(Photo photo) {
            this.photo = photo;
        }

        public Photo getPhoto() {
            return photo;
        }
    }
}
