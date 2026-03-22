package com.awesomeapp.logcontact

sealed class State74_102 {
    data object Loading : State74_102()
    data class Success(val data: String) : State74_102()
    data class Error(val message: String) : State74_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}