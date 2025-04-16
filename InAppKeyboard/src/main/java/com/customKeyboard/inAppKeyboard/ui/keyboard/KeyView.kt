package com.customKeyboard.inAppKeyboard.ui.keyboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.data.model.Key
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey

@Stable
@Composable
internal fun KeyView(
    keyboardKey: Key,
    textSize: TextUnit=0.sp,
    color: ButtonColors,
    iconSize: Dp = 0.dp,
    buttonParams: ButtonParams,
) {

    when (keyboardKey) {
        is UtilityKey.UppercaseLong -> {
            KeyButton(
                colors = color,
                buttonParams = buttonParams,
                content = {
                    Icon(
                        ImageVector.vectorResource(id = keyboardKey.id),
                        contentDescription = keyboardKey.text,
                        modifier = Modifier
                            .size(iconSize).align(Alignment.Center),
                        tint = color.contentColor
                    )
                }
            )
        }
        is UtilityKey.Backspace -> {
            KeyButton(
                colors = color,
                buttonParams = buttonParams,
                content = {
                    Icon(
                        ImageVector.vectorResource(id = keyboardKey.id),
                        contentDescription = keyboardKey.text,
                        modifier = Modifier
                            .size(iconSize).align(Alignment.Center),
                        tint = color.contentColor
                    )
                },
                isBackSpaceKey = true
            )
        }
        else -> {
            KeyButton(
                colors = color,
                buttonParams = buttonParams,
                content = {
                    Text(
                        text = keyboardKey.text,
                        style = TextStyle(
                            fontSize = textSize,
                            fontFamily = FontFamily.Default,
                            fontWeight = FontWeight.Normal
                        ),
                        modifier = Modifier.align(Alignment.Center),
                        color = color.contentColor
                    )
                }
            )
        }
    }
}