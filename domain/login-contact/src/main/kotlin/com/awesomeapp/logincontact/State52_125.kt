package com.awesomeapp.logincontact

sealed class State52_125 {
    data object Loading : State52_125()
    data class Success(val data: String) : State52_125()
    data class Error(val message: String) : State52_125()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}