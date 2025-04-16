package com.customKeyboard.inAppKeyboard.ui.keyboard

import android.app.Activity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.data.KeysConstants
import com.customKeyboard.inAppKeyboard.data.KeysConstants.FIRST_ROW_ALPHANUMERIC_KEYBOARD_TEXT
import com.customKeyboard.inAppKeyboard.data.KeysConstants.FOUR_ROW_ALPHANUMERIC_KEYBOARD_TEXT
import com.customKeyboard.inAppKeyboard.data.KeysConstants.SECOND_ROW_ALPHANUMERIC_KEYBOARD_TEXT
import com.customKeyboard.inAppKeyboard.data.KeysConstants.THIRD_ROW_ALPHANUMERIC_KEYBOARD_TEXT
import com.customKeyboard.inAppKeyboard.data.KeysDataSource
import com.customKeyboard.inAppKeyboard.data.keyboardAction.KeyboardController
import com.customKeyboard.inAppKeyboard.data.model.Key
import com.customKeyboard.inAppKeyboard.ui.theme.default_padding_value
import com.customKeyboard.inAppKeyboard.ui.theme.keyboard_background_color

@Composable
@SuppressWarnings("kotlin:S3776")
internal fun AlphaNumericKeyboard(
    activity: Activity,
    modifier: Modifier
) {

    //this mutable state is for handling long press on uppercase icon
    val isUpperCaseLongPress = remember {
        mutableStateOf(false)
    }
    //this mutable state is for handling uppercase enable and disable.
    val isUpperCase = remember { mutableStateOf(true) }

    //this mutable state is for handling numeric key of keyboard
    val isNumeric = remember {
        mutableStateOf(false)
    }

    //this mutable state is for maintain number of keys in row
    val rowList = remember {
        mutableStateOf(listOf(FIRST_ROW_ALPHANUMERIC_KEYBOARD_TEXT, SECOND_ROW_ALPHANUMERIC_KEYBOARD_TEXT, THIRD_ROW_ALPHANUMERIC_KEYBOARD_TEXT, FOUR_ROW_ALPHANUMERIC_KEYBOARD_TEXT))
    }

    val alphabets = KeysDataSource.chatKeyboardNormalKey
    val uppercaseAlphabets =
        KeysDataSource.chatKeyboardUpperCaseKey
    val numericKey = KeysDataSource.chatKeyboardNumericKey
    var firstIndexOfRow: Int
    var lastIndexOfRow: Int
    var keys: MutableList<Key> = uppercaseAlphabets
    val inputConnectionListener = KeyActionHandler(activity)

    /**
     * setUpperCaseAlphabets : This method will set uppercase key for keyboard
     */
    fun setUpperCaseAlphabets() {
        rowList.value = listOf(FIRST_ROW_ALPHANUMERIC_KEYBOARD_TEXT, SECOND_ROW_ALPHANUMERIC_KEYBOARD_TEXT, THIRD_ROW_ALPHANUMERIC_KEYBOARD_TEXT, FOUR_ROW_ALPHANUMERIC_KEYBOARD_TEXT)
        isUpperCase.value = true
        keys = uppercaseAlphabets
    }

    /**
     * setNormalAlphabets : This method will set lowercase alphabets for keyboard
     */
    fun setNormalAlphabets() {
        rowList.value = listOf(FIRST_ROW_ALPHANUMERIC_KEYBOARD_TEXT, SECOND_ROW_ALPHANUMERIC_KEYBOARD_TEXT, THIRD_ROW_ALPHANUMERIC_KEYBOARD_TEXT, FOUR_ROW_ALPHANUMERIC_KEYBOARD_TEXT)
        isUpperCase.value = false
        keys = alphabets
    }

    /**
     * setNumericKey : This method will set numeric keys for keyboard
     */
    fun setNumericKey() {
        rowList.value = listOf(
            KeysConstants.FIRST_ROW_ALPHANUMERIC_NUMBER,
            KeysConstants.SECOND_ROW_ALPHANUMERIC_NUMBER,
            KeysConstants.THIRD_ROW_ALPHANUMERIC_NUMBER,
            KeysConstants.FOUR_ROW_ALPHANUMERIC_NUMBER
        )
        keys = numericKey
    }

    //This if else block is for change uppercase icons
    if (isUpperCaseLongPress.value && !isNumeric.value) {
        keys[KeysConstants.UPPERCASE_KEY_INDEX] = UtilityKey.UppercaseLong
    } else {
        if (isUpperCase.value) {
            keys[KeysConstants.UPPERCASE_KEY_INDEX] = UtilityKey.UppercaseEnable
        } else {
            keys[KeysConstants.UPPERCASE_KEY_INDEX] = UtilityKey.UppercaseDisable
        }
    }

    //This if else block is for set different kind of keys of keyboard
    if (isNumeric.value) {
        setNumericKey()
    } else {
        if (isUpperCase.value || isUpperCaseLongPress.value) {
            setUpperCaseAlphabets()
        } else {
            setNormalAlphabets()
        }
    }
    LaunchedEffect(KeyboardController.keyboardVisible.value) {
        isUpperCase.value = true
    }
    AnimatedVisibility(
        visible = KeyboardController.keyboardVisible.value,
        enter = EnterTransition.None,
        exit = ExitTransition.None
    ) {

        //This Box is most parent layout of chat keyboard
        Box(
            modifier = modifier
                .height(dimensionResource(com.intuit.sdp.R.dimen._189sdp))
                .fillMaxWidth(),
        ) {
            //This column is holder for keyboard rows
            Column(
                Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(color = keyboard_background_color)
                    .padding(
                        top = dimensionResource(com.intuit.sdp.R.dimen._8sdp),
                        bottom = dimensionResource(com.intuit.sdp.R.dimen._4sdp),
                        start = default_padding_value,
                        end = default_padding_value
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                firstIndexOfRow = 0
                lastIndexOfRow = rowList.value[0]

                //This for loop create number of rows in keyboard based on row list value
                for (rowIndex in 0 until rowList.value.size) {
                    //This is keyboard row
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement =  Arrangement.spacedBy(0.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        //This for loop create number of keys in one row
                        for (i in firstIndexOfRow until lastIndexOfRow) {
                            AlphanumericKeyboardKey(
                                keyboardKey = keys[i],
                                onClick = {
                                    when (it) {
                                        is TextUtilityKey.Numeric -> {
                                            isNumeric.value = true
                                        }
                                        is TextUtilityKey.SPACE -> {
                                            inputConnectionListener.onCommitText(" ")
                                        }
                                        is TextUtilityKey.ABC -> {
                                            isNumeric.value = false
                                        }
                                        is UtilityKey.Backspace -> {
                                            inputConnectionListener.onBackSpace()
//                                            if (textFieldValue.value.text.isEmpty()) {
//                                                isUpperCase.value = true
//                                            }
                                        }
                                        is UtilityKey.Enter -> {
                                            inputConnectionListener.onCommitText("\n")
                                            isUpperCase.value = true
                                        }
                                        is UtilityKey.UppercaseDisable, UtilityKey.UppercaseEnable -> {
                                            isUpperCase.value = !isUpperCase.value
                                        }
                                        is UtilityKey.UppercaseLong -> {
                                            isUpperCaseLongPress.value = false
                                            isUpperCase.value = false
                                        }
                                        else -> {
                                            inputConnectionListener.onCommitText(it.text)
                                            if (!isUpperCaseLongPress.value) {
                                                isUpperCase.value = false
                                            }
                                        }
                                    }
                                },
                                modifier = Modifier.weight(1f),
                                onLongPress = {
                                    when(it) {
                                        UtilityKey.UppercaseEnable, UtilityKey.UppercaseDisable -> {
                                            isUpperCaseLongPress.value = true
                                        }
                                        UtilityKey.UppercaseLong -> {
                                            isUpperCaseLongPress.value = false
                                            isUpperCase.value = false
                                        }
                                    }
                                }
                            )
                        }
                    }
                    if (rowIndex != rowList.value.size - 1) {
                        firstIndexOfRow = lastIndexOfRow
                        lastIndexOfRow += rowList.value[rowIndex + 1]
                    }
                }
            }
        }
    }
}