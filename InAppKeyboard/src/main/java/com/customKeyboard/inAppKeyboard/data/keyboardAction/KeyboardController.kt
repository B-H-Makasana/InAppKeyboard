package com.customKeyboard.inAppKeyboard.data.keyboardAction

import androidx.compose.runtime.mutableStateOf
import com.customKeyboard.inAppKeyboard.data.KeyboardActionHelper

object KeyboardController {

    internal var keyboardVisible = mutableStateOf(false)
    internal var keyboardType = mutableStateOf("")

    /**
     * keyboardVisible : This method is used to show and hide keyboard
     * @param visible : Pass true if show else pass false
     */
    fun keyboardVisible(visible: Boolean) {
        keyboardVisible.value = visible
    }

    /**
     * keyboardType : This method is used to set keyboard type
     * @param keyboardType : Pass object of KeyboardType
     */
    fun keyboardType(keyboardType: KeyboardType) {
        if (keyboardType is KeyboardType.AlphaNumeric) {
            KeyboardController.keyboardType.value = KeyboardActionHelper.ALPHANUMERIC
        } else {
            KeyboardController.keyboardType.value = KeyboardActionHelper.NUMERIC
        }
    }
}
