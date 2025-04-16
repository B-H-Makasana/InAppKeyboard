package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import org.junit.Rule
import org.junit.Test
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharParams
import com.customKeyboard.inAppKeyboard.data.testTag
import com.customKeyboard.inAppKeyboard.ui.keyboard.SpecialCharViewDesign
import com.customKeyboard.inAppKeyboard.ui.chatkeyboard.isKeyPressed

class SpecialCharViewDesignTest {
    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun specialCharViewDesignTest(){
        isKeyPressed.value = "A"
        val specialCharList = listOf(SpecialCharParams("1",false), SpecialCharParams("2",true))
        composeTestRule.setContent {
            SpecialCharViewDesign(specialCharList,0.dp,0.dp)
        }
        composeTestRule.onNodeWithTag(testTag).performClick()
    }

    @Test
    fun specialCharViewDesignTest1(){
        isKeyPressed.value = ""
        val specialCharList = listOf(SpecialCharParams("1",false), SpecialCharParams("2",true))
        composeTestRule.setContent {
            SpecialCharViewDesign(specialCharList,0.dp,0.dp)
        }
    }
}