package com.awesomeapp.notificationcontact

sealed class State68_116 {
    data object Loading : State68_116()
    data class Success(val data: String) : State68_116()
    data class Error(val message: String) : State68_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}