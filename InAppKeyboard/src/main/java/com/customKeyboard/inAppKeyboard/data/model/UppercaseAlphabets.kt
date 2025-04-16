package com.customKeyboard.inAppKeyboard.data.model

internal sealed class UppercaseAlphabets(
    override val text: String
) : Key, Cloneable {
    object A : UppercaseAlphabets("A")
    object B : UppercaseAlphabets("B")
    object C : UppercaseAlphabets("C")
    object D : UppercaseAlphabets("D")
    object E : UppercaseAlphabets("E")
    object F : UppercaseAlphabets("F")
    object G : UppercaseAlphabets("G")
    object H : UppercaseAlphabets("H")
    object I : UppercaseAlphabets("I")
    object J : UppercaseAlphabets("J")
    object K : UppercaseAlphabets("K")
    object L : UppercaseAlphabets("L")
    object M : UppercaseAlphabets("M")
    object N : UppercaseAlphabets("N")
    object O : UppercaseAlphabets("O")
    object P : UppercaseAlphabets("P")
    object Q : UppercaseAlphabets("Q")
    object R : UppercaseAlphabets("R")
    object S : UppercaseAlphabets("S")
    object T : UppercaseAlphabets("T")
    object U : UppercaseAlphabets("U")
    object V : UppercaseAlphabets("V")
    object W : UppercaseAlphabets("W")
    object X : UppercaseAlphabets("X")
    object Y : UppercaseAlphabets("Y")
    object Z : UppercaseAlphabets("Z")
}