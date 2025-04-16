package com.customKeyboard.inAppKeyboard.data

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharactersKey

class SpecialCharacterKeyTest {
 
    @Test
    fun testDotObject() {
        val str = "."
        val result = SpecialCharactersKey.Dot
        assertEquals(str, result.text)
    }

    @Test
    fun testDashObject() {
        val str = "-"
        val result = SpecialCharactersKey.Dash
        assertEquals(str, result.text)
    }

    @Test
    fun testAndObject() {
        val str = "&"
        val result = SpecialCharactersKey.And
        assertEquals(str, result.text)
    }

    @Test
    fun testParenthesesBracketsLeftObject() {
        val str = "("
        val result = SpecialCharactersKey.ParenthesesBracketsLeft
        assertEquals(str, result.text)
    }

    @Test
    fun testParenthesesBracketsRightObject() {
        val str = ")"
        val result = SpecialCharactersKey.ParenthesesBracketsRight
        assertEquals(str, result.text)
    }

    @Test
    fun testBackSlashObject() {
        val str = "/"
        val result = SpecialCharactersKey.BackSlash
        assertEquals(str, result.text)
    }

    @Test
    fun testQuotesObject() {
        val str = "\""
        val result = SpecialCharactersKey.Quotes
        assertEquals(str, result.text)
    }

    @Test
    fun testSingleQuotesObject() {
        val str = "\'"
        val result = SpecialCharactersKey.SingleQuotes
        assertEquals(str, result.text)
    }

    @Test
    fun testColonObject() {
        val str = ":"
        val result = SpecialCharactersKey.Colon
        assertEquals(str, result.text)
    }

    @Test
    fun testSemiColonObject() {
        val str = ";"
        val result = SpecialCharactersKey.Semicolon
        assertEquals(str, result.text)
    }

    @Test
    fun testExclamationObject() {
        val str = "!"
        val result = SpecialCharactersKey.Exclamation
        assertEquals(str, result.text)
    }

    @Test
    fun testQuestionObject() {
        val str = "?"
        val result = SpecialCharactersKey.Question
        assertEquals(str, result.text)
    }

    @Test
    fun testAmpersatObject() {
        val str = "@"
        val result = SpecialCharactersKey.At
        assertEquals(str, result.text)
    }

    @Test
    fun testCommaObject() {
        val str = ","
        val result = SpecialCharactersKey.Comma
        assertEquals(str, result.text)
    }

    @Test
    fun testEuroObject() {
        val str = "€"
        val result = SpecialCharactersKey.Euro
        assertEquals(str, result.text)
    }
}