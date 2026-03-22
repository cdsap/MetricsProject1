package com.awesomeapp.networklogin

sealed class State112_128 {
    data object Loading : State112_128()
    data class Success(val data: String) : State112_128()
    data class Error(val message: String) : State112_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}