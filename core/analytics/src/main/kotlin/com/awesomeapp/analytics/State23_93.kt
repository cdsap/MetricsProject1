package com.awesomeapp.analytics

sealed class State23_93 {
    data object Loading : State23_93()
    data class Success(val data: String) : State23_93()
    data class Error(val message: String) : State23_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}