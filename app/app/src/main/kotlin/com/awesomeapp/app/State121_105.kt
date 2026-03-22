package com.awesomeapp.app

sealed class State121_105 {
    data object Loading : State121_105()
    data class Success(val data: String) : State121_105()
    data class Error(val message: String) : State121_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}