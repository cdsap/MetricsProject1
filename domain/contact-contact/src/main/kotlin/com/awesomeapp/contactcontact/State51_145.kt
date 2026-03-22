package com.awesomeapp.contactcontact

sealed class State51_145 {
    data object Loading : State51_145()
    data class Success(val data: String) : State51_145()
    data class Error(val message: String) : State51_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}