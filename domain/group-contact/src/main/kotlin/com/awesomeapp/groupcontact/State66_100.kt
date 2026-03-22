package com.awesomeapp.groupcontact

sealed class State66_100 {
    data object Loading : State66_100()
    data class Success(val data: String) : State66_100()
    data class Error(val message: String) : State66_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}