package com.awesomeapp.logincontact

sealed class State52_98 {
    data object Loading : State52_98()
    data class Success(val data: String) : State52_98()
    data class Error(val message: String) : State52_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}