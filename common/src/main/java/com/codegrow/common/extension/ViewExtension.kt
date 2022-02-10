package com.codegrow.common.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.codegrow.common.R

fun ImageView.loadImagesWithGlideExt(url: String) {
    Glide.with(this.context)
        .load(url)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .into(this)
}