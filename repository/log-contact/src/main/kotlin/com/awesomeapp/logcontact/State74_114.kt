package com.awesomeapp.logcontact

sealed class State74_114 {
    data object Loading : State74_114()
    data class Success(val data: String) : State74_114()
    data class Error(val message: String) : State74_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}