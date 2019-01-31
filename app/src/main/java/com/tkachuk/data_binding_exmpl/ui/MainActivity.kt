package com.tkachuk.data_binding_exmpl.ui

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.tkachuk.data_binding_exmpl.R
import com.tkachuk.data_binding_exmpl.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewmodel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val binding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewmodel = viewmodel
        binding.user = viewmodel.user
        binding.user!!.imageUrl = "http://tiny.cc/image_porfile"

    }

}
