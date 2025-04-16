package com.customKeyboard.inAppKeyboard.data.model

import com.customKeyboard.inAppKeyboard.R
import com.customKeyboard.inAppKeyboard.data.KeysConstants

internal sealed class UtilityKey(
    open val id: Int,
    override val text: String
) : Key {
    data object Backspace : UtilityKey(
        R.drawable.outline_backspace_24,
        ""
    )
    data object UppercaseLong :
        UtilityKey(R.drawable.icon_shift_double_selected, "")
    data object UppercaseDisable : UtilityKey(
        R.drawable.icon_shift_not_selected,
        KeysConstants.UPPER_CASE_KEY
    )
    data object UppercaseEnable : UtilityKey(
        R.drawable.icon_shift_selected,
        KeysConstants.UPPER_CASE_KEY
    )
    data object Enter: UtilityKey(R.drawable.baseline_keyboard_return_24, KeysConstants.ENTER_KEY)
}