package com.awesomeapp.task

sealed class State28_149 {
    data object Loading : State28_149()
    data class Success(val data: String) : State28_149()
    data class Error(val message: String) : State28_149()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}