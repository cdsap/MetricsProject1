package com.awesomeapp.videocontact

sealed class State93_121 {
    data object Loading : State93_121()
    data class Success(val data: String) : State93_121()
    data class Error(val message: String) : State93_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}