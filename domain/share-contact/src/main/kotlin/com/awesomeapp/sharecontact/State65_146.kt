package com.awesomeapp.sharecontact

sealed class State65_146 {
    data object Loading : State65_146()
    data class Success(val data: String) : State65_146()
    data class Error(val message: String) : State65_146()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}