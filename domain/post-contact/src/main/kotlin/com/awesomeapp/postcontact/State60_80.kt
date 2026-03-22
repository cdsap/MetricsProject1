package com.awesomeapp.postcontact

sealed class State60_80 {
    data object Loading : State60_80()
    data class Success(val data: String) : State60_80()
    data class Error(val message: String) : State60_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}