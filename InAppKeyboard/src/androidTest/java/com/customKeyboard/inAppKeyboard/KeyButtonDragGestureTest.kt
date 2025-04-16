package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyButtonDragGesture

class KeyButtonDragGestureTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun specialCharViewTest() {
        composeTestRule.setContent {
            val buttonParams = ButtonParams(
                onClick = {}
            )
            KeyButtonDragGesture(buttonParams, MaterialTheme.shapes.extraSmall, content = {})
        }
    }
}