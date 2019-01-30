package com.tkachuk.data_binding_exmpl

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.tkachuk.data_binding_exmpl.data.User
import com.tkachuk.data_binding_exmpl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("Igor", 22)

//        //Init view
//        val nameTextView: TextView = findViewById(R.id.name_tv)
//        val ageTextView: TextView = findViewById(R.id.age_tv)

//        //Set data
//        nameTextView.text = user.name
//        ageTextView.text = user.age.toString()

        val binding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = user

    }
}
