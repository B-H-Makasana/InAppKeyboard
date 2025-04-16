package com.customKeyboard.inAppKeyboard.data

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.KeysConstants.FIRST_ROW_ALPHANUMERIC_NUMBER

class KeyConstantTest {

    @Test
    fun testConstant() {
        val numericKey = "123"
        val abcKey = "ABC"
        val spaceKey = "space"
        val firstRowAlphanumericText = 10
        val secondRowAlphanumericText = 9
        val thirdRowAlphanumericText = 9
        val fourRowAlphanumericText = 3
        val firstRowNumeric = 3
        val secondRowNumeric = 3
        val thirdRowNumeric = 3
        val fourRowNumeric = 3
        val firstRowAlphanumericNumber = 10
        val secondRowAlphanumericNumber = 10
        val thirdRowAlphanumericNumber = 7
        val fourRowAlphanumericNumber = 3
        assertEquals(numericKey, KeysConstants.NUMERIC_KEY)
        assertEquals(abcKey, KeysConstants.ABC_KEY)
        assertEquals(spaceKey, KeysConstants.SPACE_KEY)
        assertEquals(firstRowNumeric, KeysConstants.FIRST_ROW_NUMERIC)
        assertEquals(secondRowNumeric, KeysConstants.SECOND_ROW_NUMERIC)
        assertEquals(thirdRowNumeric, KeysConstants.THIRD_ROW_NUMERIC)
        assertEquals(fourRowNumeric, KeysConstants.FOUR_ROW_NUMERIC)
        assertEquals(firstRowAlphanumericNumber ,FIRST_ROW_ALPHANUMERIC_NUMBER)
        assertEquals(secondRowAlphanumericNumber, KeysConstants.SECOND_ROW_ALPHANUMERIC_NUMBER)
        assertEquals(thirdRowAlphanumericNumber, KeysConstants.THIRD_ROW_ALPHANUMERIC_NUMBER)
        assertEquals(fourRowAlphanumericNumber, KeysConstants.FOUR_ROW_ALPHANUMERIC_NUMBER)
    }

    @Test
    fun testKeyboardHeloper() {
        val numeric = "Numeric"
        val alphaNumeric = "AlphaNumeric"
        assertEquals(numeric, KeyboardActionHelper.NUMERIC)
        assertEquals(alphaNumeric, KeyboardActionHelper.ALPHANUMERIC)
    }
}