package br.com.mobiplus.mvp.view;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseView {

    private Activity activity;
    protected ViewGroup mRootView;

    public BaseView(Activity activity) {
        this.activity = activity;
        this.initDefaultViews(this.getLayoutResId());
        this.initViews();
    }

    private void initDefaultViews(int layoutResId) {
        activity.setContentView(layoutResId);
        mRootView = (ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public View findViewById(int resId) {
        return mRootView.findViewById(resId);
    }

    public Activity getActivity() {
        return activity;
    }

    protected abstract int getLayoutResId();

    protected abstract void initViews();
}
