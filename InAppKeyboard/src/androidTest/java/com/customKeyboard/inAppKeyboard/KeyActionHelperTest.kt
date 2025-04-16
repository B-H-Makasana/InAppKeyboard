package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.text.input.TextFieldValue
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyActionHandler

@RunWith(AndroidJUnit4::class)
class KeyActionHelperTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun keyActionHandlerTest() {
        composeTestRule.setContent {
            val keyActionHandler = KeyActionHandler(composeTestRule.activity)
            TextField(value = TextFieldValue(), onValueChange = { TextFieldValue() },Modifier.testTag("Test").focusRequester(
                FocusRequester()
            )
            )
            keyActionHandler.onCommitText("A")
            keyActionHandler.onBackSpace()
        }
    }

    @Test
    fun keyActionHandlerTestNullInputConnection() {
        val keyboardActionHandler= KeyActionHandler(composeTestRule.activity)
        keyboardActionHandler.onCommitText("A")
        keyboardActionHandler.onBackSpace()
    }
}