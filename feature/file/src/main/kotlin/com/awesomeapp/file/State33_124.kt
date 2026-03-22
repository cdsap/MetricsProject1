package com.awesomeapp.file

sealed class State33_124 {
    data object Loading : State33_124()
    data class Success(val data: String) : State33_124()
    data class Error(val message: String) : State33_124()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}