package com.awesomeapp.video

sealed class State44_128 {
    data object Loading : State44_128()
    data class Success(val data: String) : State44_128()
    data class Error(val message: String) : State44_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}