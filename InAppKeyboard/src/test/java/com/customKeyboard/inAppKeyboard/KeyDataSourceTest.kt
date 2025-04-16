package com.customKeyboard.inAppKeyboard

import com.customKeyboard.inAppKeyboard.data.KeysDataSource
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.KeysDataSource.constructNumericKeyboardKeys
import com.customKeyboard.inAppKeyboard.data.KeysDataSource.constructAlphanumericKeys
import com.customKeyboard.inAppKeyboard.data.KeysDataSource.constructAlphaNumericKeys
import com.customKeyboard.inAppKeyboard.data.KeysDataSource.constructAlphaNumericUpperCaseKeys

class KeyDataSourceTest {

    @Test
    fun numericKeyboardKeyTest() {
        val keyList = constructNumericKeyboardKeys()
        assertArrayEquals(
            keyList.toTypedArray(),
            KeysDataSource.numericKeyboardKey.toTypedArray()
        )
    }

    @Test
    fun chatKeyboardNormalKeyTest() {
        val keyList = constructAlphanumericKeys()
        assertArrayEquals(
            keyList.toTypedArray(),
            KeysDataSource.chatKeyboardNormalKey.toTypedArray()
        )
    }

    @Test
    fun chatKeyboardUpperCaseKeyTest() {
        val keyList = constructAlphaNumericUpperCaseKeys()
        assertArrayEquals(
            keyList.toTypedArray(),
            KeysDataSource.chatKeyboardUpperCaseKey.toTypedArray()
        )
    }

    @Test
    fun chatKeyboardNumericKeyTest() {
        val keyList = constructAlphaNumericKeys()
        assertArrayEquals(
            keyList.toTypedArray(),
            KeysDataSource.chatKeyboardNumericKey.toTypedArray()
        )
    }
}