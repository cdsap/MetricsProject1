package com.awesomeapp.app

sealed class State121_141 {
    data object Loading : State121_141()
    data class Success(val data: String) : State121_141()
    data class Error(val message: String) : State121_141()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}