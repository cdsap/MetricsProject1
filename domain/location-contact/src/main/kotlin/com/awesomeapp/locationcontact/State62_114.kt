package com.awesomeapp.locationcontact

sealed class State62_114 {
    data object Loading : State62_114()
    data class Success(val data: String) : State62_114()
    data class Error(val message: String) : State62_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}