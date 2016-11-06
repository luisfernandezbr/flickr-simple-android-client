package br.com.mobiplus.flickr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.mobiplus.flickr.mvp.model.pojo.v2.Photo;
import br.com.mobiplus.flickr.mvp.presenter.PhotoDetailsPresenter;
import br.com.mobiplus.flickr.mvp.view.PhotoDetailsViewImpl;

public class PhotoDetailsActivity extends AppCompatActivity {

    public static void start(Context context, Photo photo) {
        Intent starter = new Intent(context, PhotoDetailsActivity.class);
        starter.putExtra("photo", photo);
        context.startActivity(starter);
    }

    PhotoDetailsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_details);

        this.presenter = new PhotoDetailsPresenter(this, (Photo) getIntent().getSerializableExtra("photo"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        presenter.onActivityResult(requestCode, resultCode, data);
    }
}
