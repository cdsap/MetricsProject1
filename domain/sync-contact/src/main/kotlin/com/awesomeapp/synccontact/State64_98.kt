package com.awesomeapp.synccontact

sealed class State64_98 {
    data object Loading : State64_98()
    data class Success(val data: String) : State64_98()
    data class Error(val message: String) : State64_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}