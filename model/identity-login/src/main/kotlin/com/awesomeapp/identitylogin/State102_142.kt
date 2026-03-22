package com.awesomeapp.identitylogin

sealed class State102_142 {
    data object Loading : State102_142()
    data class Success(val data: String) : State102_142()
    data class Error(val message: String) : State102_142()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}