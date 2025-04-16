package com.customKeyboard.inAppKeyboard.ui.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.intuit.sdp.R
import com.customKeyboard.inAppKeyboard.data.KeysConstants.FIRST_ROW_NUMERIC
import com.customKeyboard.inAppKeyboard.data.KeysConstants.FOUR_ROW_NUMERIC
import com.customKeyboard.inAppKeyboard.data.KeysConstants.SECOND_ROW_NUMERIC
import com.customKeyboard.inAppKeyboard.data.KeysConstants.THIRD_ROW_NUMERIC
import com.customKeyboard.inAppKeyboard.data.KeysDataSource
import com.customKeyboard.inAppKeyboard.data.model.Key
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharactersKey
import com.customKeyboard.inAppKeyboard.ui.theme.keyboard_background_color
import com.customKeyboard.inAppKeyboard.ui.theme.text_key_background_color

/**
 * NumericKeyboardView : This method create a keyboard view for numeric keyboard
 * @param modifier : modifier for keyboard view
 * @param keyActionHandler : object of KeyActionHandler class
 */
@Composable
@Stable
internal fun NumericKeyboardView(modifier: Modifier, keyActionHandler: KeyActionHandler) {
    val keys = KeysDataSource.numericKeyboardKey
    val rowList = remember {
        mutableStateOf(
            listOf(
                FIRST_ROW_NUMERIC,
                SECOND_ROW_NUMERIC,
                THIRD_ROW_NUMERIC,
                FOUR_ROW_NUMERIC
            )
        )
    }
    var firstIndexOfRow = 0
    var lastIndexOfRow = rowList.value[0]

    //this Box is most parent layout of keyboard
    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = keyboard_background_color)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) {},
        contentAlignment = Alignment.BottomEnd
    ) {
        //this column is holder for keyboard rows
        Column(
            Modifier.padding(top=dimensionResource(R.dimen._6sdp)).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            //this for loop create number of rows in keyboard based on rowList value
            for (rowIndex in 0 until rowList.value.size) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(0.dp)
                ) {
                    //this for loop create row and placing keyboard key inside row
                    for (columnIndex in firstIndexOfRow until lastIndexOfRow) {
                        KeyboardKey(
                            keyboardKey = keys[columnIndex],
                            onClick = { onClickButton(it, keyActionHandler) },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    if (rowIndex < rowList.value.size - 1) {
                        firstIndexOfRow = lastIndexOfRow
                        lastIndexOfRow += rowList.value[rowIndex + 1]
                    }
                }
            }
        }
    }
}

/**
 * onClickButton : This method is taking action based on key click in keyboard
 * @param key : Pass clicked key of keyboard
 * @param keyActionHandler : object of KeyActionHandler class
 */
fun onClickButton(key: Key, keyActionHandler: KeyActionHandler) {
    if (key is UtilityKey.Backspace) {
        keyActionHandler.onBackSpace()
    } else {
        keyActionHandler.onCommitText(key.text)
    }
}

/**
 * KeyboardKey : This method is passing parameters to KeyButton based on different key's view
 * @param keyboardKey : pass keyboard key
 * @param onClick : pass onclick event of key
 * @param modifier: pass modifier
 */
@Composable
fun KeyboardKey(
    keyboardKey: Key,
    onClick: (key: Key) -> Unit,
    modifier: Modifier
) {
    val buttonParams = ButtonParams(
        modifier,
        {},
        onClick = { onClick(keyboardKey) },
        enabled = true,
        height = dimensionResource(R.dimen._48sdp),
        contentPadding = PaddingValues(4.dp)
    )
    when (keyboardKey) {
        is UtilityKey.Backspace -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = keyboard_background_color,
                contentColor = Color.Black
            )
            KeyButton(
                buttonParams = buttonParams, colors = colors, content = {
                    Icon(
                        ImageVector.vectorResource(id = keyboardKey.id),
                        contentDescription = keyboardKey.text,
                        modifier = Modifier
                            .size(dimensionResource(R.dimen._18sdp)).align(Alignment.Center),
                        tint = Color.Black
                    )
                },
                isBackSpaceKey = true,
                shape = RoundedCornerShape(dimensionResource(R.dimen._5sdp))
            )
        }
        is SpecialCharactersKey.Empty -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = keyboard_background_color
            )
            KeyButton(
                buttonParams = buttonParams, colors = colors, content = {},
                shape = RoundedCornerShape(dimensionResource(R.dimen._5sdp))
            )
        }
        else -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = text_key_background_color
            )
            KeyButton(
                buttonParams = buttonParams,
                colors = colors,
                content = {
                    Text(
                        text = keyboardKey.text,
                        style = TextStyle(
                            fontSize = dimensionResource(com.intuit.ssp.R.dimen._23ssp).value.sp,
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Normal
                        ),
                        modifier = Modifier.align(Alignment.Center),
                        color=Color.Black
                    )
                },
                shape = RoundedCornerShape(dimensionResource(R.dimen._5sdp))
            )
        }
    }
}