package com.awesomeapp.weather

sealed class State39_100 {
    data object Loading : State39_100()
    data class Success(val data: String) : State39_100()
    data class Error(val message: String) : State39_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}