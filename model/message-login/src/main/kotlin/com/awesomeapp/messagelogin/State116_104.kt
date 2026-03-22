package com.awesomeapp.messagelogin

sealed class State116_104 {
    data object Loading : State116_104()
    data class Success(val data: String) : State116_104()
    data class Error(val message: String) : State116_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}