package com.customKeyboard.inAppKeyboard

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.remember
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import org.junit.Rule
import org.junit.Test
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.ui.keyboard.KeyButtonLongClick

class KeyButtonLongClickTest {

    @Rule
    @JvmField
    val composeTestRule = createComposeRule()

    @Test
    fun keyButtonLongClickTest(){
        composeTestRule.setContent {
            val interactionSource = remember { MutableInteractionSource() }

            val modifier = androidx.compose.ui.Modifier
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
            KeyButtonLongClick(buttonParams = buttonParams, content = {})
        }
    }
}