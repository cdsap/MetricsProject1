package com.awesomeapp.status

sealed class State26_120 {
    data object Loading : State26_120()
    data class Success(val data: String) : State26_120()
    data class Error(val message: String) : State26_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}