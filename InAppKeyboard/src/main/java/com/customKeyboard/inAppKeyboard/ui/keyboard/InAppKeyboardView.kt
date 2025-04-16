package com.customKeyboard.inAppKeyboard.ui.keyboard

import android.app.Activity
import androidx.compose.animation.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.customKeyboard.inAppKeyboard.data.KeyboardActionHelper
import com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardController

/**
 * KeyboardView : This method will be called from app in which keyboard library will integrate
 * @param activity : pass activity
 * @param modifier : modifier for keyboard view
 */
@Composable
fun InAppKeyboardView(
    activity: Activity,
    modifier: Modifier = Modifier
) {
    val rememberedKeyboardType = remember {
        mutableStateOf("")
    }
    val rememberKeyboardVisibility = remember {
        mutableStateOf(false)
    }
    rememberedKeyboardType.value = KeyboardController.keyboardType.value
    rememberKeyboardVisibility.value = KeyboardController.keyboardVisible.value

    AnimatedVisibility(
        visible = rememberKeyboardVisibility.value, enter = EnterTransition.None, exit = ExitTransition.None
    ) {
        if (rememberedKeyboardType.value == KeyboardActionHelper.ALPHANUMERIC) {
            AlphaNumericKeyboard(
                activity, modifier
            )
        } else {
            NumericKeyboardView(
                modifier, KeyActionHandler(activity)
            )
        }
    }

    if (!rememberKeyboardVisibility.value) {
        activity.currentFocus?.clearFocus()
    }
}