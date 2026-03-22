package com.awesomeapp.identitylogin

sealed class State102_139 {
    data object Loading : State102_139()
    data class Success(val data: String) : State102_139()
    data class Error(val message: String) : State102_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}