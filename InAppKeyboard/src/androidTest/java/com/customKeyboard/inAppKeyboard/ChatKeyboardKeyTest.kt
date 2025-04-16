package com.customKeyboard.inAppKeyboard

import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharactersKey
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.ui.keyboard.AlphanumericKeyboardKey

@RunWith(AndroidJUnit4::class)
class ChatKeyboardKeyTest {
    @Rule
    @JvmField
    val composeTestRule = createComposeRule()
    
    @Test
    fun chatKeyboardKeyTest() {
       composeTestRule.setContent {
           AlphanumericKeyboardKey(keyboardKey = UtilityKey.UppercaseLong, onClick = {}, modifier = Modifier, onLongPress = {})
       }
    }

    @Test
    fun chatKeyboardKeyTest1() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = UtilityKey.Enter, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTest2() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = UtilityKey.Backspace, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTest3() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = UppercaseAlphabets.Z, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTest4() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = TextUtilityKey.SPACE, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTest5() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = SpecialCharactersKey.UnderScore, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTest6() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(keyboardKey = TextUtilityKey.ABC, onClick = {}, modifier = Modifier, onLongPress = {})
        }
    }

    @Test
    fun chatKeyboardKeyTestDashNumericKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.Dash,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }

    @Test
    fun chatKeyboardKeyTestDotKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.Dot,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }

    @Test
    fun chatKeyboardKeyTestCommaKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.Comma,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }

    @Test
    fun chatKeyboardKeyTestQuestionKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.Question,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }

    @Test
    fun chatKeyboardKeyTestExclamationKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.Exclamation,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }

    @Test
    fun chatKeyboardKeyTestSingleQuoteKey() {
        composeTestRule.setContent {
            AlphanumericKeyboardKey(
                keyboardKey = SpecialCharactersKey.SingleQuotes,
                onClick = {},
                modifier = Modifier,
                onLongPress = {}
            )
        }
    }
}