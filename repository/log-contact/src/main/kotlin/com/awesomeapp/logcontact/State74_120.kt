package com.awesomeapp.logcontact

sealed class State74_120 {
    data object Loading : State74_120()
    data class Success(val data: String) : State74_120()
    data class Error(val message: String) : State74_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}