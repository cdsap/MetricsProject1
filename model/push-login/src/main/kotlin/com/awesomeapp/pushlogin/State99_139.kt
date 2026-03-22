package com.awesomeapp.pushlogin

sealed class State99_139 {
    data object Loading : State99_139()
    data class Success(val data: String) : State99_139()
    data class Error(val message: String) : State99_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}