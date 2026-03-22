package com.awesomeapp.app

sealed class State121_123 {
    data object Loading : State121_123()
    data class Success(val data: String) : State121_123()
    data class Error(val message: String) : State121_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}