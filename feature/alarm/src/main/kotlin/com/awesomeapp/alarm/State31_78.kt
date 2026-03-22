package com.awesomeapp.alarm

sealed class State31_78 {
    data object Loading : State31_78()
    data class Success(val data: String) : State31_78()
    data class Error(val message: String) : State31_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}