package com.awesomeapp.profilecontact

sealed class State57_139 {
    data object Loading : State57_139()
    data class Success(val data: String) : State57_139()
    data class Error(val message: String) : State57_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}