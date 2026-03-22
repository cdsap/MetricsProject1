package com.awesomeapp.taskcontact

sealed class State77_78 {
    data object Loading : State77_78()
    data class Success(val data: String) : State77_78()
    data class Error(val message: String) : State77_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}