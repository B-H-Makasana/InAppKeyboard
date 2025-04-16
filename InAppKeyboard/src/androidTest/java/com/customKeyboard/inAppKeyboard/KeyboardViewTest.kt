package com.customKeyboard.inAppKeyboard

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.customKeyboard.inAppKeyboard.data.KeyboardActionHelper
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyActionHandler
import com.customKeyboard.inAppKeyboard.ui.keyboard.InAppKeyboardView

@RunWith(AndroidJUnit4::class)
class KeyboardViewTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<androidx.activity.ComponentActivity>()

    @Test
    fun keyboardViewTestNumericVisible(){
        composeTestRule.setContent {
            KeyActionHandler.keyboardVisible.value=true
            KeyActionHandler.keyboardType.value= KeyboardActionHelper.NUMERIC
            InAppKeyboardView(composeTestRule.activity)
        }
    }

    @Test
    fun keyboardViewTestTextVisible(){
        composeTestRule.setContent {
            KeyActionHandler.keyboardVisible.value=true
            KeyActionHandler.keyboardType.value= KeyboardActionHelper.ALPHANUMERIC
            InAppKeyboardView(composeTestRule.activity)
        }
    }
}