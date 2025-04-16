package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.ui.keyboard.SpecialCharViewLayout
import com.customKeyboard.inAppKeyboard.ui.chatkeyboard.isKeyPressed

@RunWith(AndroidJUnit4::class)
class SpecialCharViewTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun specialCharViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = ""
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharAViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "A"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharAViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "a"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharEViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "E"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharEViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "e"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharIViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "I"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharIViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "i"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharOViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "O"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharOViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "o"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharaViewUTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "U"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharaViewUTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "u"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharCViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "C"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharCViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "c"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharNViewTest() {
        composeTestRule.setContent {
            isKeyPressed.value = "N"
            SpecialCharViewLayout()
        }
    }

    @Test
    fun specialCharNViewTest1() {
        composeTestRule.setContent {
            isKeyPressed.value = "n"
            SpecialCharViewLayout()
        }
    }
}
