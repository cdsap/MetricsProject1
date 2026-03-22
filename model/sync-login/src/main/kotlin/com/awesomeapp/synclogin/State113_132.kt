package com.awesomeapp.synclogin

sealed class State113_132 {
    data object Loading : State113_132()
    data class Success(val data: String) : State113_132()
    data class Error(val message: String) : State113_132()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}