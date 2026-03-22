package com.awesomeapp.postcontact

sealed class State60_101 {
    data object Loading : State60_101()
    data class Success(val data: String) : State60_101()
    data class Error(val message: String) : State60_101()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}