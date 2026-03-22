package com.awesomeapp.identitycontact

sealed class State53_129 {
    data object Loading : State53_129()
    data class Success(val data: String) : State53_129()
    data class Error(val message: String) : State53_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}