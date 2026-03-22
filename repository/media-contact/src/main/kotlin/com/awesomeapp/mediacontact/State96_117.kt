package com.awesomeapp.mediacontact

sealed class State96_117 {
    data object Loading : State96_117()
    data class Success(val data: String) : State96_117()
    data class Error(val message: String) : State96_117()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}