package com.awesomeapp.postcontact

sealed class State60_116 {
    data object Loading : State60_116()
    data class Success(val data: String) : State60_116()
    data class Error(val message: String) : State60_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}