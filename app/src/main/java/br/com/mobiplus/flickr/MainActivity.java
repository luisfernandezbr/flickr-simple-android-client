package br.com.mobiplus.flickr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.mobiplus.flickr.model.PhotoInfoResult;
import br.com.mobiplus.flickr.model.PhotoSearchResult;
import br.com.mobiplus.flickr.rest.RetrofitFacade;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new RetrofitFacade(getApplicationContext()).requestPhotosSearch("nfl", new Callback<PhotoSearchResult>() {
            @Override
            public void success(PhotoSearchResult photoSearchResult, Response response) {
                Toast.makeText(MainActivity.this, "" + photoSearchResult, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, "" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        new RetrofitFacade(getApplicationContext()).requestPhotoInfo("30737682925", new Callback<PhotoInfoResult>() {
            @Override
            public void success(PhotoInfoResult photoInfoResult, Response response) {
                Toast.makeText(MainActivity.this, "" + photoInfoResult, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, "" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
