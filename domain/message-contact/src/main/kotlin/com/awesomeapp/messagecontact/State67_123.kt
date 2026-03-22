package com.awesomeapp.messagecontact

sealed class State67_123 {
    data object Loading : State67_123()
    data class Success(val data: String) : State67_123()
    data class Error(val message: String) : State67_123()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}