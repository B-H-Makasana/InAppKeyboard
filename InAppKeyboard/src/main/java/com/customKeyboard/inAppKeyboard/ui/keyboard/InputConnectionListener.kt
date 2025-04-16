package com.customKeyboard.inAppKeyboard.ui.keyboard

interface InputConnectionListener {
    fun onCommitText(it: String)
    fun onBackSpace()
}