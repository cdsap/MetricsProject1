package com.awesomeapp.sharecontact

sealed class State65_89 {
    data object Loading : State65_89()
    data class Success(val data: String) : State65_89()
    data class Error(val message: String) : State65_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}