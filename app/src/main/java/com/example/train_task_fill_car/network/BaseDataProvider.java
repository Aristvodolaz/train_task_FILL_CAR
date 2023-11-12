package com.example.train_task_fill_car.network;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class BaseDataProvider {
    protected Observable.Transformer schedulerTransformer;
//    protected Api service = ServiceModule.getInstance().getService();

    public BaseDataProvider() {
        schedulerTransformer = o -> ((Observable) o)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io());
    }

    protected <T> Observable.Transformer<T, T> applySchedulers() {
        return (Observable.Transformer<T, T>) schedulerTransformer;
    }
}
