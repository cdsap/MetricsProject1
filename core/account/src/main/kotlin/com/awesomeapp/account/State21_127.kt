package com.awesomeapp.account

sealed class State21_127 {
    data object Loading : State21_127()
    data class Success(val data: String) : State21_127()
    data class Error(val message: String) : State21_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}