package com.awesomeapp.file

sealed class State33_127 {
    data object Loading : State33_127()
    data class Success(val data: String) : State33_127()
    data class Error(val message: String) : State33_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}