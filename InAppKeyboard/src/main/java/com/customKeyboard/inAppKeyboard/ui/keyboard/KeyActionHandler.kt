package com.customKeyboard.inAppKeyboard.ui.keyboard

import android.app.Activity
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import androidx.compose.runtime.Immutable

@Immutable
//this class is taking action based on key press
class KeyActionHandler(private var activity: Activity) : InputConnectionListener {
    private var inputConnection: InputConnection? = null

    /**
     * onCommitText: This method will write text in focus area
     * @param it: pass text that needs to write on text field
     */
    override fun onCommitText(it: String) {
        inputConnection = activity.window.currentFocus?.onCreateInputConnection(EditorInfo())
        inputConnection?.commitText(it, it.length)
    }

    /**
     * onBackSpace: This method will remove text from text field
     */
    override fun onBackSpace() {
        inputConnection = activity.window.currentFocus?.onCreateInputConnection(EditorInfo())
        inputConnection?.deleteSurroundingText(1, 0)
    }
}