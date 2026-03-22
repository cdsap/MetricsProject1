package com.awesomeapp.messagecontact

sealed class State67_93 {
    data object Loading : State67_93()
    data class Success(val data: String) : State67_93()
    data class Error(val message: String) : State67_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}