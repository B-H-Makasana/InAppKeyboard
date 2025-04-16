package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.data.model.Digit
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.ui.keyboard.AlphanumericKeyboard
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyActionHandler
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyboardRow
import com.customKeyboard.inAppKeyboard.ui.keyboard.onButtonClick

@RunWith(AndroidJUnit4::class)
class AlphanumericKeyboardViewTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun alphanumericKeyboardViewTest() {
        composeTestRule.setContent {
            AlphanumericKeyboard(
                modifier = Modifier,
                keyActionHandler = KeyActionHandler(composeTestRule.activity)
            )
        }
    }

    @Test
    fun onButtonClickTestSpaceKey() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(TextUtilityKey.SPACE, KeyActionHandler(composeTestRule.activity), isNumeric)
        }
    }

    @Test
    fun onButtonClickTestNumeric() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(TextUtilityKey.Numeric, KeyActionHandler(composeTestRule.activity), isNumeric)
        }
    }

    @Test
    fun onButtonClickTestABC() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(TextUtilityKey.ABC, KeyActionHandler(composeTestRule.activity), isNumeric)
        }
    }

    @Test
    fun onButtonClickTestBackspace() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                UtilityKey.Backspace,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestDone() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                TextUtilityKey.Numeric,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestNext() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                TextUtilityKey.ABC,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestUpperCase() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                UppercaseAlphabets.A,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestUpperCaseLong() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                UtilityKey.UppercaseLong,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestNormalKey() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(false)
            }
            onButtonClick(
                UppercaseAlphabets.A,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun onButtonClickTestDigitKey() {
        composeTestRule.setContent {
            val isNumeric = remember {
                mutableStateOf(true)
            }
            onButtonClick(
                Digit.Nine,
                KeyActionHandler(composeTestRule.activity),
                isNumeric
            )
        }
    }

    @Test
    fun keyboardRowTestSpaceBy() {
        composeTestRule.setContent {
            KeyboardRow(
                keys = listOf(
                    UppercaseAlphabets.A,
                    UppercaseAlphabets.B,
                    UppercaseAlphabets.C
                ),
                keyActionHandler = KeyActionHandler(composeTestRule.activity),
                remember {
                    mutableStateOf(false)
                }
            )
        }
    }

    @Test
    fun keyboardRowTestSpaceAround() {
        composeTestRule.setContent {
            KeyboardRow(
                keys = listOf(
                    UppercaseAlphabets.A,
                    UppercaseAlphabets.B,
                    UppercaseAlphabets.C
                ),
                keyActionHandler = KeyActionHandler(composeTestRule.activity),
                remember {
                    mutableStateOf(false)
                }
            )
        }
    }
}