package com.awesomeapp.loginlogin

sealed class State101_99 {
    data object Loading : State101_99()
    data class Success(val data: String) : State101_99()
    data class Error(val message: String) : State101_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}