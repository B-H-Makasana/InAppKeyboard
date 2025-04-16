package com.customKeyboard.inAppKeyboard.data.keyboardAction

import androidx.annotation.Keep
import com.customKeyboard.inAppKeyboard.data.KeyboardActionHelper

//This class is used for handle keyboard types
@Keep
sealed class KeyboardType(var keyboardType: String) {
    data object AlphaNumeric : KeyboardType(KeyboardActionHelper.ALPHANUMERIC)
    data object Numeric : KeyboardType(KeyboardActionHelper.NUMERIC)
}