package com.example.sharedviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel(){
    val inputText = MutableLiveData<String>()

    fun setInputText(strInput : String)
    {
        inputText.value = strInput
    }
}