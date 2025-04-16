package com.customKeyboard.inAppKeyboard.ui.keyboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.data.model.Key

/**
 * AlphanumericKeyView : This method different kind of button bases on key type
 * @param keyboardKey : Key of keyboard
 * @param textSize : size of key's text
 * @param color: background and text color of key
 * @param iconSize: icon size of key
 * @param shapes : shape of key
 * @param buttonParams: pass ButtonParams with required parameters
 */
@Composable
@SuppressWarnings("kotlin:S107")
internal fun AlphanumericKeyView(
    keyboardKey: Key,
    textSize: TextUnit = 0.sp,
    color: ButtonColors,
    iconSize: Dp = 0.dp,
    shapes: CornerBasedShape = MaterialTheme.shapes.extraSmall,
    buttonParams: ButtonParams
) {

    when (keyboardKey) {
        UtilityKey.Backspace -> {
            KeyButton(
                shape = shapes,
                colors = color,
                buttonParams = buttonParams,
                content = {
                    Icon(
                        ImageVector.vectorResource(id = (keyboardKey as UtilityKey).id),
                        contentDescription = keyboardKey.text,
                        modifier = Modifier
                            .size(iconSize)
                            .align(Alignment.Center),
                        tint = color.contentColor
                    )
                },
                isBackSpaceKey = true
            )
        }
        else -> {
            KeyButton(shape = shapes,
                colors = color,
                buttonParams = buttonParams,
                content = {
                    if (keyboardKey is UtilityKey) {
                        Icon(
                            ImageVector.vectorResource(id = keyboardKey.id),
                            contentDescription = keyboardKey.text,
                            modifier = Modifier
                                .size(iconSize)
                                .align(Alignment.Center),
                            tint = color.contentColor
                        )
                    } else {
                        Text(
                            text = keyboardKey.text,
                            style = TextStyle(
                                fontSize = textSize
                            ),
                            modifier = Modifier.align(Alignment.Center),
                            color = color.contentColor
                        )
                    }
                }
            )
        }
    }
}