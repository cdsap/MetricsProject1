package com.awesomeapp.postcontact

sealed class State60_98 {
    data object Loading : State60_98()
    data class Success(val data: String) : State60_98()
    data class Error(val message: String) : State60_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}