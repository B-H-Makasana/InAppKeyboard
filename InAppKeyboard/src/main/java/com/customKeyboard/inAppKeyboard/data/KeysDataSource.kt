package com.customKeyboard.inAppKeyboard.data

import com.customKeyboard.inAppKeyboard.data.model.Alphabets
import com.customKeyboard.inAppKeyboard.data.model.Digit
import com.customKeyboard.inAppKeyboard.data.model.Key
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharactersKey.*
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey

internal object KeysDataSource {

    val numericKeyboardKey: MutableList<Key> =
        constructNumericKeyboardKeys()
    val chatKeyboardNormalKey:MutableList<Key> = constructAlphanumericKeys()
    val chatKeyboardUpperCaseKey:MutableList<Key> = constructAlphaNumericUpperCaseKeys()
    val chatKeyboardNumericKey:MutableList<Key> = constructAlphaNumericKeys()

    /**
     * constructAlphaNumericKeys: This method will prepare list of numeric keys for chat keyboard
     */
    fun constructAlphaNumericKeys() = mutableListOf<Key>().apply {
        add(Digit.One)
        add(Digit.Two)
        add(Digit.Three)
        add(Digit.Four)
        add(Digit.Five)
        add(Digit.Six)
        add(Digit.Seven)
        add(Digit.Eight)
        add(Digit.Nine)
        add(Digit.Zero)
        add(At)
        add(Hash)
        add(Percent)
        add(UnderScore)
        add(And)
        add(Dash)
        add(Plus)
        add(ParenthesesBracketsLeft)
        add(ParenthesesBracketsRight)
        add(BackSlash)
        add(Backtick)
        add(Star)
        add(Quotes)
        add(SingleQuotes)
        add(Colon)
        add(Semicolon)
        add(Exclamation)
        add(Question)
        add(UtilityKey.Backspace)
        add(TextUtilityKey.ABC)
        add(Comma)
        add(TextUtilityKey.SPACE)
        add(Dot)
        add(UtilityKey.Enter)
    }

    /**
     * constructNumericKeyboardKeys : This method will prepare list of keys for numeric keyboard
     */
    fun constructNumericKeyboardKeys() = mutableListOf<Key>().apply {
        add(Digit.One)
        add(Digit.Two)
        add(Digit.Three)
        add(Digit.Four)
        add(Digit.Five)
        add(Digit.Six)
        add(Digit.Seven)
        add(Digit.Eight)
        add(Digit.Nine)
        add(Empty)
        add(Digit.Zero)
        add(UtilityKey.Backspace)
    }

    /**
     * constructAlphanumericKeys: This method will prepare list of alphabets lowercase key for chat keyboard
     */
    fun constructAlphanumericKeys()= mutableListOf<Key>().apply {
        add(Alphabets.Q)
        add(Alphabets.W)
        add(Alphabets.E)
        add(Alphabets.R)
        add(Alphabets.T)
        add(Alphabets.Y)
        add(Alphabets.U)
        add(Alphabets.I)
        add(Alphabets.O)
        add(Alphabets.P)
        add(Alphabets.A)
        add(Alphabets.S)
        add(Alphabets.D)
        add(Alphabets.F)
        add(Alphabets.G)
        add(Alphabets.H)
        add(Alphabets.J)
        add(Alphabets.K)
        add(Alphabets.L)
        add(UtilityKey.UppercaseDisable)
        add(Alphabets.Z)
        add(Alphabets.X)
        add(Alphabets.C)
        add(Alphabets.V)
        add(Alphabets.B)
        add(Alphabets.N)
        add(Alphabets.M)
        add(UtilityKey.Backspace)
        add(TextUtilityKey.Numeric)
        add(Comma)
        add(TextUtilityKey.SPACE)
        add(Dot)
        add(UtilityKey.Enter)
    }

    /**
     * constructChatKeyboardUpperCaseKeys: This method will prepare list of uppercase alphabets for chat keyboard
     */
    fun constructAlphaNumericUpperCaseKeys()= mutableListOf<Key>().apply {
        add(UppercaseAlphabets.Q)
        add(UppercaseAlphabets.W)
        add(UppercaseAlphabets.E)
        add(UppercaseAlphabets.R)
        add(UppercaseAlphabets.T)
        add(UppercaseAlphabets.Y)
        add(UppercaseAlphabets.U)
        add(UppercaseAlphabets.I)
        add(UppercaseAlphabets.O)
        add(UppercaseAlphabets.P)
        add(UppercaseAlphabets.A)
        add(UppercaseAlphabets.S)
        add(UppercaseAlphabets.D)
        add(UppercaseAlphabets.F)
        add(UppercaseAlphabets.G)
        add(UppercaseAlphabets.H)
        add(UppercaseAlphabets.J)
        add(UppercaseAlphabets.K)
        add(UppercaseAlphabets.L)
        add(UtilityKey.UppercaseEnable)
        add(UppercaseAlphabets.Z)
        add(UppercaseAlphabets.X)
        add(UppercaseAlphabets.C)
        add(UppercaseAlphabets.V)
        add(UppercaseAlphabets.B)
        add(UppercaseAlphabets.N)
        add(UppercaseAlphabets.M)
        add(UtilityKey.Backspace)
        add(TextUtilityKey.Numeric)
        add(Comma)
        add(TextUtilityKey.SPACE)
        add(Dot)
        add(UtilityKey.Enter)
    }
}