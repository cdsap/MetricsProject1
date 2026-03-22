package com.awesomeapp.settinglogin

sealed class State118_99 {
    data object Loading : State118_99()
    data class Success(val data: String) : State118_99()
    data class Error(val message: String) : State118_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}