package com.awesomeapp.searchlogin

sealed class State110_101 {
    data object Loading : State110_101()
    data class Success(val data: String) : State110_101()
    data class Error(val message: String) : State110_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}