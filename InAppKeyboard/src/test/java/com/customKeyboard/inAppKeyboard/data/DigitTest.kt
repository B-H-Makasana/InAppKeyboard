package com.customKeyboard.inAppKeyboard.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.model.Digit

class DigitTest {

    @Test
    fun zeroTest(){
        val result= Digit.Zero
        Assertions.assertEquals("0",result.text)
    }


    @Test
    fun oneTest(){
        val result= Digit.One
        Assertions.assertEquals("1",result.text)
    }

    @Test
    fun twoTest(){
        val result= Digit.Two
        Assertions.assertEquals("2",result.text)
    }

    @Test
    fun threeTest(){
        val result= Digit.Three
        Assertions.assertEquals("3",result.text)
    }

    @Test
    fun fourTest(){
        val result= Digit.Four
        Assertions.assertEquals("4",result.text)
    }

    @Test
    fun fiveTest(){
        val result= Digit.Five
        Assertions.assertEquals("5",result.text)
    }

    @Test
    fun sixTest(){
        val result= Digit.Six
        Assertions.assertEquals("6",result.text)
    }

    @Test
    fun sevenTest(){
        val result= Digit.Seven
        Assertions.assertEquals("7",result.text)
    }

    @Test
    fun eightTest(){
        val result= Digit.Eight
        Assertions.assertEquals("8",result.text)
    }

    @Test
    fun nineTest(){
        val result= Digit.Nine
        Assertions.assertEquals("9",result.text)
    }
}