package com.tkachuk.data_binding_exmpl.util

import android.databinding.BindingAdapter
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import android.R.attr.name
import android.databinding.BindingConversion
import com.tkachuk.data_binding_exmpl.data.User


object BindingAdapters {

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun loadImage(imageView: ImageView, url: String) {
        Picasso.get().load(url).into(imageView)
    }

    @JvmStatic
    @BindingConversion
    fun convertUsersToString(users: List<User>): String {
        val sb = StringBuilder()
        for (user in users) {
            sb.append(user.name+"|")
        }
        return sb.toString()
    }
}