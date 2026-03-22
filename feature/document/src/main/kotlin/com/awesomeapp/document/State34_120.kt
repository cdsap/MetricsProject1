package com.awesomeapp.document

sealed class State34_120 {
    data object Loading : State34_120()
    data class Success(val data: String) : State34_120()
    data class Error(val message: String) : State34_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}