package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.text.input.TextFieldValue
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.ui.chatkeyboard.AlphaNumericKeyboard

@RunWith(AndroidJUnit4::class)
class ChatKeyboardTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun chatKeyboardViewTest() {
        val mockTextField = mutableStateOf(TextFieldValue(""))
        composeTestRule.setContent {
            AlphaNumericKeyboard(
                composeTestRule.activity,
                modifier = Modifier,
                mockTextField
            )
        }
    }
}