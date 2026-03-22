package com.awesomeapp.playlist

sealed class State49_99 {
    data object Loading : State49_99()
    data class Success(val data: String) : State49_99()
    data class Error(val message: String) : State49_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}