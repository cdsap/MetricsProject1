package com.awesomeapp.networkcontact

sealed class State63_127 {
    data object Loading : State63_127()
    data class Success(val data: String) : State63_127()
    data class Error(val message: String) : State63_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}