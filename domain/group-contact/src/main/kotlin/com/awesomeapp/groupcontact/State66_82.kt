package com.awesomeapp.groupcontact

sealed class State66_82 {
    data object Loading : State66_82()
    data class Success(val data: String) : State66_82()
    data class Error(val message: String) : State66_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}