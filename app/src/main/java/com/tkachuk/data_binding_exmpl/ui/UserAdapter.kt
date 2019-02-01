package com.tkachuk.data_binding_exmpl.ui

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tkachuk.data_binding_exmpl.R
import com.tkachuk.data_binding_exmpl.data.User

class UserAdapter() : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onBindViewHolder(p0: UserViewHolder, p1: Int) {
        p0.binding.user = userList[p1]
    }

    private var userList: List<User> = listOf()


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserViewHolder {
        val binding: ItemUserBinding =
            DataBindingUtil.inflate(LayoutInflater.from(p0.context), R.layout.item_user, p0, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}