package com.customKeyboard.inAppKeyboard.data.model

internal sealed class Digit(
    override val text: String,
) : Key {
    data object Zero : Digit("0")
    data object One : Digit("1")
    data object Two : Digit("2")
    data object Three : Digit("3")
    data object Four : Digit("4")
    data object Five : Digit("5")
    data object Six : Digit("6")
    data object Seven : Digit("7")
    data object Eight : Digit("8")
    data object Nine : Digit("9")
}