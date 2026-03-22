package com.awesomeapp.video

sealed class State44_134 {
    data object Loading : State44_134()
    data class Success(val data: String) : State44_134()
    data class Error(val message: String) : State44_134()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}