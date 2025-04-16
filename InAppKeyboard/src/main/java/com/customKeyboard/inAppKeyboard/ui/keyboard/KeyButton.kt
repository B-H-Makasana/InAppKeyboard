package com.customKeyboard.inAppKeyboard.ui.keyboard

import android.view.MotionEvent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.dimensionResource
import kotlinx.coroutines.delay
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.ui.theme.button_pressed_backgroundColor
import com.customKeyboard.inAppKeyboard.ui.theme.content_padding_value
import com.customKeyboard.inAppKeyboard.ui.theme.keyboard_background_color

/**
 * KeyButton : This method create a keyboard button
 * @param buttonParams : pass required parameters through ButtonParams class
 * @param shape : pass shape for key
 * @param colors : Pass background color and content color as object of ButtonColors
 * @param isBackSpaceKey : Pass true if key is backspace key
 * @param content : pass content of button either text or icon
 */
@OptIn(ExperimentalComposeUiApi::class)
@Stable
@Composable
internal fun KeyButton(
    buttonParams: ButtonParams,
    shape: Shape = MaterialTheme.shapes.extraSmall,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    isBackSpaceKey: Boolean = false,
    content: @Composable BoxScope.() -> Unit
) {
     val isBackSpace= remember {
         mutableStateOf(false)
     }
    val color = colors.containerColor
    val backgroundColor = remember {
        mutableStateOf(color)
    }
    if (isBackSpaceKey) {
        LaunchedEffect(isBackSpace.value) {
            delay(300)
            while (isBackSpace.value) {
                buttonParams.onClick()
                delay(60)
            }
        }
    }
    Surface(
        modifier = buttonParams.modifier.pointerInteropFilter {
            when (it.action) {
                MotionEvent.ACTION_DOWN -> {
                    buttonParams.onClick()
                    isBackSpace.value = true
                    backgroundColor.value = button_pressed_backgroundColor
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    isBackSpace.value = true
                    true
                }
                else -> {
                    isBackSpace.value = false
                    backgroundColor.value = color
                    false
                }
            }
        }.height(buttonParams.height).width(buttonParams.width),
        color = keyboard_background_color
    ) {
        Box(
            modifier = Modifier.padding(buttonParams.contentPadding?:PaddingValues(
                    bottom = dimensionResource(com.intuit.sdp.R.dimen._9sdp),
            start = content_padding_value,
            end = content_padding_value
        )).background(
                color= backgroundColor.value,shape = shape),
            content = content,
        )
    }
}