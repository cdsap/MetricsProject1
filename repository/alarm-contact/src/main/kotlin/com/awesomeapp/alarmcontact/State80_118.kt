package com.awesomeapp.alarmcontact

sealed class State80_118 {
    data object Loading : State80_118()
    data class Success(val data: String) : State80_118()
    data class Error(val message: String) : State80_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}