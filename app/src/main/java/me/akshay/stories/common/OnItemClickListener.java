package me.akshay.stories.common;

import android.view.View;

public interface OnItemClickListener<T>{
    void onClicked(View view, T t);
}
