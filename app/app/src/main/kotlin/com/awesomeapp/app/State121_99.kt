package com.awesomeapp.app

sealed class State121_99 {
    data object Loading : State121_99()
    data class Success(val data: String) : State121_99()
    data class Error(val message: String) : State121_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}