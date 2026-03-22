package com.awesomeapp.groupcontact

sealed class State66_139 {
    data object Loading : State66_139()
    data class Success(val data: String) : State66_139()
    data class Error(val message: String) : State66_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}