package com.tkachuk.data_binding_exmpl.data

import android.databinding.ObservableInt

data class User(var name: String, var age: Int, var likes: ObservableInt) {
    fun isAdult() = age > 18

    var imageUrl: String = ""
}

//
//class User : BaseObservable() {
//
//    @get:Bindable
//    var name: String = ""
//        set(value) {
//            field = value
//            notifyPropertyChanged(BR.name)
//
//        }
//
//    @get:Bindable
//    var age: Int = 0
//        set(value) {
//            field = value
//            notifyPropertyChanged(BR.age)
//        }
//
//    val likes: Int = 0
//
//    fun isAdult() = age > 18
//}