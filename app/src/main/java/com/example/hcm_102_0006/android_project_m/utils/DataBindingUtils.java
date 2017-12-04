package com.example.hcm_102_0006.android_project_m.utils;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.example.hcm_102_0006.android_project_m.data.model.MovieDetail;
import com.example.hcm_102_0006.android_project_m.data.source.remote.MovieApi;
import com.example.hcm_102_0006.android_project_m.ui.moviedetail.MovieDetailViewModel;
import com.github.ivbaranov.mfb.MaterialFavoriteButton;

/**
 * Created by hcm-102-0006 on 29/11/2017.
 */

public class DataBindingUtils {
    @BindingAdapter("adapter")
    public static void setRecyclerAdapter(RecyclerView view, RecyclerView.Adapter adapter) {
        view.setAdapter(adapter);
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void setImageUrl(ImageView imageView, String url) {
        Context context = imageView.getContext();
        Glide.with(context)
                .load(url)
                .into(imageView);
    }

    @BindingAdapter({"bind:favorite"})
    public static void setFavorite(MaterialFavoriteButton materialFavoriteButton, boolean isFavorite) {
        materialFavoriteButton.setFavorite(isFavorite);
    }
}
