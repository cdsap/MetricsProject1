package com.awesomeapp.identitylogin

sealed class State102_109 {
    data object Loading : State102_109()
    data class Success(val data: String) : State102_109()
    data class Error(val message: String) : State102_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}