package com.awesomeapp.taskcontact

sealed class State77_108 {
    data object Loading : State77_108()
    data class Success(val data: String) : State77_108()
    data class Error(val message: String) : State77_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}