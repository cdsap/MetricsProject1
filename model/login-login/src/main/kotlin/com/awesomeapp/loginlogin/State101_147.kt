package com.awesomeapp.loginlogin

sealed class State101_147 {
    data object Loading : State101_147()
    data class Success(val data: String) : State101_147()
    data class Error(val message: String) : State101_147()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}