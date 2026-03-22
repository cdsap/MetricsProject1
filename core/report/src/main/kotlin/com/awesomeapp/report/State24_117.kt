package com.awesomeapp.report

sealed class State24_117 {
    data object Loading : State24_117()
    data class Success(val data: String) : State24_117()
    data class Error(val message: String) : State24_117()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}