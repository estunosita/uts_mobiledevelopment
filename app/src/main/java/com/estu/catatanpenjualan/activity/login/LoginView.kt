package com.estu.catatanpenjualan.activity.login

import com.estu.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}