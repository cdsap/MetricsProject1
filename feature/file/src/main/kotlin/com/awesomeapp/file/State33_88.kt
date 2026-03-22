package com.awesomeapp.file

sealed class State33_88 {
    data object Loading : State33_88()
    data class Success(val data: String) : State33_88()
    data class Error(val message: String) : State33_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}