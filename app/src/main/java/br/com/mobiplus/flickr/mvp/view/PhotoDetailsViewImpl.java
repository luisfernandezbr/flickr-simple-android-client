package br.com.mobiplus.flickr.mvp.view;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.mobiplus.flickr.R;
import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;
import br.com.mobiplus.mvp.view.BaseView;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public class PhotoDetailsViewImpl extends BaseView implements PhotoDetailsView {

    public PhotoDetailsViewImpl(Activity activity) {
        super(activity);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_photo_details;
    }

    @Override
    protected void initViews() {

    }

    @Override
    public void onLoadData(Photo photo) {
        ImageView imageBanner = (ImageView) findViewById(R.id.imageBanner);
        ImageView imageAvatar = (ImageView) findViewById(R.id.imageAvatar);

        Picasso.with(getActivity()).load(photo.getUrlL()).into(imageBanner);
        Picasso.with(getActivity()).load(photo.getAvatarUrl()).into(imageAvatar);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        TextView textDescription = (TextView) findViewById(R.id.textDescription);
        TextView textDetails = (TextView) findViewById(R.id.textDetails);

        textTitle.setText(photo.getOwnername());
        textDescription.setText(photo.getTitle());
        textDetails.setText(photo.getDescription().getContent());
    }
}
