package com.customKeyboard.inAppKeyboard.data

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey

class AlphaNumericUtilityKeyTest {
    
    @Test
    fun numericObjectTest(){
        val str= KeysConstants.NUMERIC_KEY
        val result= TextUtilityKey.Numeric
        assertEquals(str,result.text)
    }
    
    @Test
    fun aBCObjectTest(){
        val str= KeysConstants.ABC_KEY
        val result= TextUtilityKey.ABC
        assertEquals(str,result.text)
    }
    
    @Test
    fun spaceObjectTest(){
        val str= KeysConstants.SPACE_KEY
        val result= TextUtilityKey.SPACE
        assertEquals(str,result.text)
    }
}