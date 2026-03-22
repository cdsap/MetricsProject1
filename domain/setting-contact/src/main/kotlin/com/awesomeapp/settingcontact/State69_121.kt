package com.awesomeapp.settingcontact

sealed class State69_121 {
    data object Loading : State69_121()
    data class Success(val data: String) : State69_121()
    data class Error(val message: String) : State69_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}