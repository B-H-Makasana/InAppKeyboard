package com.customKeyboard.inAppKeyboard

import androidx.activity.ComponentActivity
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.unit.dp
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyButton

@RunWith(AndroidJUnit4::class)
class KeyButtonTest {

    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun keyButtonTest() {
        composeTestRule.setContent {
            val interactionSource = remember { MutableInteractionSource() }

            val modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .padding(1.dp)
                .height(dimensionResource(com.intuit.sdp.R.dimen._48sdp))
                .width(dimensionResource(com.intuit.sdp.R.dimen._100sdp))
                .semantics { this.contentDescription = "test"; this.testTag = "test" }

            val buttonParams = ButtonParams(
                modifier,
                {},
                onClick = { },
                contentPadding = PaddingValues(0.dp),
                enabled = true
            )
            KeyButton(buttonParams, content = {})
        }
    }

    @Test
    fun keyButtonTestBackSpace() {
        composeTestRule.setContent {
            val interactionSource = remember { MutableInteractionSource() }

            val modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .padding(1.dp)
                .height(dimensionResource(com.intuit.sdp.R.dimen._48sdp))
                .width(dimensionResource(com.intuit.sdp.R.dimen._100sdp))

            val buttonParams = ButtonParams(
                modifier,
                {},
                onClick = { },
                contentPadding = PaddingValues(0.dp),
                enabled = true
            )
            KeyButton(buttonParams, isBackSpaceKey = true, content = {})
        }
    }
}