package com.customKeyboard.inAppKeyboard.ui.keyboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.customKeyboard.inAppKeyboard.data.model.Alphabets
import com.customKeyboard.inAppKeyboard.data.model.ButtonParams
import com.customKeyboard.inAppKeyboard.data.model.SpecialCharactersKey
import com.customKeyboard.inAppKeyboard.data.model.TextUtilityKey
import com.customKeyboard.inAppKeyboard.data.model.UtilityKey
import com.customKeyboard.inAppKeyboard.data.model.getPaddingParamsOfSecondRow
import com.intuit.sdp.R
import com.customKeyboard.inAppKeyboard.data.model.Key
import com.customKeyboard.inAppKeyboard.data.model.UppercaseAlphabets
import com.customKeyboard.inAppKeyboard.ui.theme.action_key_background_color
import com.customKeyboard.inAppKeyboard.ui.theme.icon_key_background_color
import com.customKeyboard.inAppKeyboard.ui.theme.text_key_background_color

/**
 * AlphanumericKeyboardKey : This method is used for create ui of chat keyboard key bases on condition
 * @param keyboardKey : pass key parameter
 * @param onClick : Pass onclick action of keyboard key
 * @param modifier : pass modifier for space key only
 * @param onLongPress: pass onLongPress action of keyboard key
 */
@Composable
internal fun AlphanumericKeyboardKey(
    keyboardKey: Key,
    onClick: (key: Key) -> Unit,
    modifier: Modifier,
    onLongPress: (key: Key) -> Unit
) {
    val buttonParams = ButtonParams(
        onLongClick = { onLongPress(keyboardKey) },
        onClick = { onClick(keyboardKey) },
        enabled = true,
        height = dimensionResource(R.dimen._42sdp)
    )
    when (keyboardKey) {
        is UtilityKey.Enter -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = icon_key_background_color,
                contentColor = Color.Black
            )

            buttonParams.width = dimensionResource(R.dimen._42sdp)
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                color = colors,
                shapes = RoundedCornerShape(dimensionResource(R.dimen._12sdp)),
                iconSize = dimensionResource(R.dimen._15sdp),
                buttonParams = buttonParams
            )
        }

        is UtilityKey.UppercaseEnable, UtilityKey.UppercaseDisable, UtilityKey.UppercaseLong -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = icon_key_background_color,
                contentColor = action_key_background_color
            )
            buttonParams.width = dimensionResource(R.dimen._42sdp)
            buttonParams.contentPadding = PaddingValues(bottom = dimensionResource(R.dimen._9sdp), start = 2.dp, end = dimensionResource(R.dimen._6sdp))
            KeyButtonLongClick(
                colors = colors,
                buttonParams = buttonParams,
                content = {
                    val keyId = (keyboardKey as UtilityKey).id
                    Icon(
                        ImageVector.vectorResource(id = keyId),
                        contentDescription = keyboardKey.text,
                        modifier = Modifier.align(Alignment.Center),
                        tint = action_key_background_color
                    )
                }
            )
        }

        is UtilityKey -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = icon_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.width = dimensionResource(R.dimen._42sdp)
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                color = colors,
                iconSize = dimensionResource(R.dimen._15sdp),
                buttonParams = buttonParams
            )
        }

        is TextUtilityKey.SPACE -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = text_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.modifier = modifier
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._12ssp).value.sp,
                color = colors,
                buttonParams = buttonParams
            )
        }

        is SpecialCharactersKey.Backtick -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = icon_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.width = dimensionResource(R.dimen._42sdp)
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._19ssp).value.sp,
                color = colors,
                buttonParams = buttonParams
            )
        }

        is TextUtilityKey -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = icon_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.width = dimensionResource(R.dimen._42sdp)
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._12ssp).value.sp,
                color = colors,
                buttonParams = buttonParams
            )
        }

        is Alphabets.A, Alphabets.L, UppercaseAlphabets.A, UppercaseAlphabets.L -> {
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._19ssp).value.sp,
                color = ButtonDefaults.buttonColors(
                    containerColor = text_key_background_color,
                    contentColor = Color.Black
                ),
                buttonParams = getPaddingParamsOfSecondRow(buttonParams,keyboardKey)
            )
        }

        is SpecialCharactersKey.Dot,SpecialCharactersKey.Comma -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = text_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.width = dimensionResource(R.dimen._32sdp)
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._19ssp).value.sp,
                color = colors,
                buttonParams = buttonParams
            )
        }

        else -> {
            val colors = ButtonDefaults.buttonColors(
                containerColor = text_key_background_color,
                contentColor = Color.Black
            )
            buttonParams.modifier = modifier
            AlphanumericKeyView(
                keyboardKey = keyboardKey,
                textSize = dimensionResource(com.intuit.ssp.R.dimen._19ssp).value.sp,
                color = colors,
                buttonParams = buttonParams
            )
        }
    }
}