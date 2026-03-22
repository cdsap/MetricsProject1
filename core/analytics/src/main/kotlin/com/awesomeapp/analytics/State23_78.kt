package com.awesomeapp.analytics

sealed class State23_78 {
    data object Loading : State23_78()
    data class Success(val data: String) : State23_78()
    data class Error(val message: String) : State23_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}