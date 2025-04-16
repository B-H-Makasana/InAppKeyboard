package com.customKeyboard.inAppKeyboard.data

import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Modifier
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams

class ButtonParamsTest {

    @Test
    fun buttonParamsTest1() {
        val modifier: Modifier = Modifier
        val onLongClick = {}
        val onClick = {}
        val contentPadding = ButtonDefaults.ContentPadding
        val enabled = true
        val buttonParams =
            ButtonParams(modifier, onLongClick, onClick, contentPadding, enabled)
        Assertions.assertEquals(modifier, buttonParams.modifier)
        Assertions.assertEquals(onLongClick, buttonParams.onLongClick)
        Assertions.assertEquals(onClick, buttonParams.onClick)
        Assertions.assertEquals(contentPadding, buttonParams.contentPadding)
        Assertions.assertEquals(enabled, buttonParams.enabled)
    }

    @Test
    fun buttonParamsTest2() {
        val modifier: Modifier = Modifier
        val onLongClick = {}
        val onClick = {}
        val buttonParams = ButtonParams(modifier, onLongClick, onClick)
        Assertions.assertEquals(modifier, buttonParams.modifier)
        Assertions.assertEquals(onLongClick, buttonParams.onLongClick)
        Assertions.assertEquals(onClick, buttonParams.onClick)
        Assertions.assertEquals(true, buttonParams.enabled)
    }
}