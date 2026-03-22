package com.awesomeapp.alarmcontact

sealed class State80_136 {
    data object Loading : State80_136()
    data class Success(val data: String) : State80_136()
    data class Error(val message: String) : State80_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}