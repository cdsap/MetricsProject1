package com.awesomeapp.feedlogin

sealed class State107_78 {
    data object Loading : State107_78()
    data class Success(val data: String) : State107_78()
    data class Error(val message: String) : State107_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}