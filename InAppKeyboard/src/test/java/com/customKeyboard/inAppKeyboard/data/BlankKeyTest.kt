package com.customKeyboard.inAppKeyboard.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BlankKeyTest {

    @Test
    fun emptyKeyTest() {
        val result = BlankKey.EmptyKey
        Assertions.assertEquals("", result.text)
    }
}