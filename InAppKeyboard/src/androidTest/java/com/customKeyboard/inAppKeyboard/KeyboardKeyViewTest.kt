package com.customKeyboard.inAppKeyboard

import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyView
import com.customKeyboard.inAppKeyboard.ui.theme.action_key_background_color

@RunWith(AndroidJUnit4::class)
class KeyboardKeyViewTest {

    @Rule
    @JvmField
    val composeTestRule = createComposeRule()
    private var buttonParams = ButtonParams(
        onClick = {},
        enabled = true,
        height = 50.dp,
        width = 50.dp
    )
    @Test
    fun keyboardKeyViewTestNormalKey() {
        composeTestRule.setContent {
            val colors = ButtonDefaults.buttonColors(
                containerColor = action_key_background_color,
                contentColor = Color.White
            )
            KeyView(
                UppercaseAlphabets.A,
                10.sp,
                colors,
                24.dp,
                buttonParams
            )
        }
    }

    @Test
    fun keyboardKeyViewTestUpperCaseKey() {
        composeTestRule.setContent {
            val colors = ButtonDefaults.buttonColors(
                containerColor = action_key_background_color,
                contentColor = Color.White
            )
            KeyView(
                UtilityKey.UppercaseLong,
                10.sp,
                colors,
                24.dp,
                buttonParams
            )
        }
    }

    @Test
    fun keyboardKeyViewTestBackspaceKey() {
        composeTestRule.setContent {
            val colors = ButtonDefaults.buttonColors(
                containerColor = action_key_background_color,
                contentColor = Color.White
            )
            KeyView(
                UtilityKey.Backspace,
                10.sp,
                colors,
                24.dp,
                buttonParams
            )
        }
    }

    @Test
    fun keyboardKeyViewTestEnterKey() {
        composeTestRule.setContent {
            val colors = ButtonDefaults.buttonColors(
                containerColor = action_key_background_color,
                contentColor = Color.White
            )
            KeyView(
                TextUtilityKey.ABC,
                10.sp,
                colors,
                24.dp,
                buttonParams
            )
        }
    }
}