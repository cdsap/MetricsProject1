package com.awesomeapp.sharelogin

sealed class State114_97 {
    data object Loading : State114_97()
    data class Success(val data: String) : State114_97()
    data class Error(val message: String) : State114_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}