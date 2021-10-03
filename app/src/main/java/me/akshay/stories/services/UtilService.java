package me.akshay.stories.services;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.sql.Date;

import me.akshay.stories.R;

public class UtilService {

    public static void setUrlToImageView(Context context, ImageView view, String url){
        Glide.with(context).load(url).placeholder(R.mipmap.ic_launcher_foreground).into(view);
    }

    /**
     * Getting current date
     * @return String
     */
    public static String getCurrentDate() {
        return (new Date(System.currentTimeMillis())).toString();
    }

    /**
     * hiding views from layout
     *
     * @param views Views
     */
    public static void hideViews(View... views){
        for (View view : views){
            view.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * un hiding views from layout
     *
     * @param views Views
     */
    public static void showViews(View... views){
        for (View view : views){
            view.setVisibility(View.VISIBLE);
        }
    }

}
