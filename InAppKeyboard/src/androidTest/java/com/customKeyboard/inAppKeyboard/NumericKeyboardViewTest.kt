package com.customKeyboard.inAppKeyboard

import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyActionHandler
import com.customKeyboard.inAppKeyboard.ui.keyboard.NumericKeyboardView
import com.customKeyboard.inAppKeyboard.ui.keyboard.onClickButton

@RunWith(AndroidJUnit4::class)
class NumericKeyboardViewTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<androidx.activity.ComponentActivity>()

    @Test
    fun numericKeyboardViewWithNextTest() {
        composeTestRule.setContent {
            NumericKeyboardView(
                modifier = Modifier,
                keyActionHandler = KeyActionHandler(composeTestRule.activity)
            )
        }
    }

    @Test
    fun numericKeyboardViewWithDoneTest() {
        composeTestRule.setContent {
            NumericKeyboardView(
                modifier = Modifier,
                keyActionHandler = KeyActionHandler(composeTestRule.activity)
            )
        }
    }

    @Test
    fun onClickButtonBackSpaceTest() {
        composeTestRule.setContent {
            onClickButton(UtilityKey.Backspace, KeyActionHandler(composeTestRule.activity))
        }
    }

    @Test
    fun onClickButtonDoneTest() {
        composeTestRule.setContent {
            onClickButton(UtilityKey.UppercaseLong, KeyActionHandler(composeTestRule.activity))
        }
    }

    @Test
    fun onClickButtonNextTest() {
        composeTestRule.setContent {
            onClickButton(TextUtilityKey.ABC, KeyActionHandler(composeTestRule.activity))
        }
    }

    @Test
    fun onClickButtonNormalKeyTest() {
        composeTestRule.setContent {
            onClickButton(UppercaseAlphabets.A, KeyActionHandler(composeTestRule.activity))
        }
    }
}