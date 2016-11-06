package br.com.mobiplus.mvp;

import android.content.Intent;

/**
 * Created by luis.fernandez on 11/6/16.
 */

public abstract class BasePresenter {

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onActivityResult(int requestCode, int resultCode, Intent data);

}
