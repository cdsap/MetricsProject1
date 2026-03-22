package com.awesomeapp.map

sealed class State38_81 {
    data object Loading : State38_81()
    data class Success(val data: String) : State38_81()
    data class Error(val message: String) : State38_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}