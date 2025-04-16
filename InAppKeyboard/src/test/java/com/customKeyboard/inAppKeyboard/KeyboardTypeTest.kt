package com.customKeyboard.inAppKeyboard

import com.customKeyboard.inAppKeyboard.data.KeyboardActionHelper
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardType

class KeyboardTypeTest {
    
    @Test
    fun testTextClass() {
        val str = KeyboardActionHelper.ALPHANUMERIC
        val result = KeyboardType.AlphaNumeric
        assertEquals(str, result.keyboardType)
    }

    @Test
    fun testNumericClass() {
        val str = KeyboardActionHelper.NUMERIC
        val result = KeyboardType.Numeric
        assertEquals(str, result.keyboardType)
    }
}