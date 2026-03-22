package com.awesomeapp.app

sealed class State121_93 {
    data object Loading : State121_93()
    data class Success(val data: String) : State121_93()
    data class Error(val message: String) : State121_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}