package com.awesomeapp.calendar

sealed class State29_120 {
    data object Loading : State29_120()
    data class Success(val data: String) : State29_120()
    data class Error(val message: String) : State29_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}