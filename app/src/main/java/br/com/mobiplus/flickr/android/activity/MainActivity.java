package br.com.mobiplus.flickr.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.mobiplus.flickr.mvp.presenter.HomePresenter;
import retrofit.RetrofitError;

public class MainActivity extends AppCompatActivity {

    private HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new HomePresenter(this);

        makeTestRequests();
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

    private void makeTestRequests() {
//        new RetrofitFacade(getApplicationContext()).requestPhotosSearch("nfl", new Callback<PhotoSearchResult>() {
//            @Override
//            public void success(PhotoSearchResult photoSearchResult, Response response) {
//                Toast.makeText(MainActivity.this, "" + photoSearchResult, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                handleError(error);
//            }
//        });
//
//
//        new RetrofitFacade(getApplicationContext()).requestPhotoInfo("30737682925", new Callback<PhotoInfoResult>() {
//            @Override
//            public void success(PhotoInfoResult photoInfoResult, Response response) {
//                Toast.makeText(MainActivity.this, "" + photoInfoResult, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                handleError(error);
//            }
//        });
//
//        new RetrofitFacade(getApplicationContext()).requestUserInfo("40318476@N00", new Callback<PeopleInfoResult>() {
//            @Override
//            public void success(PeopleInfoResult peopleInfoResult, Response response) {
//                Toast.makeText(MainActivity.this, "" + peopleInfoResult, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                handleError(error);
//            }
//        });
//
//        new RetrofitFacade(getApplicationContext()).requestPhotoCommentList("30737682925", new Callback<PhotoCommentsResult>() {
//            @Override
//            public void success(PhotoCommentsResult photoCommentsResult, Response response) {
//                Toast.makeText(MainActivity.this, "" + photoCommentsResult, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                handleError(error);
//            }
//        });
    }

    private void handleError(RetrofitError error) {
        Toast.makeText(MainActivity.this, "" + error.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
