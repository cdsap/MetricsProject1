package com.awesomeapp.alarmcontact

sealed class State80_145 {
    data object Loading : State80_145()
    data class Success(val data: String) : State80_145()
    data class Error(val message: String) : State80_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}