package com.awesomeapp.settingcontact

sealed class State69_130 {
    data object Loading : State69_130()
    data class Success(val data: String) : State69_130()
    data class Error(val message: String) : State69_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}