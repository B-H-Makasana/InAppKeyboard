package com.customKeyboard.inAppKeyboard.data.model

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.customKeyboard.inAppKeyboard.ui.theme.content_padding_value

internal data class ButtonParams(
    var modifier: Modifier = Modifier,
    var onLongClick: () -> Unit = {},
    var onClick: () -> Unit,
    var contentPadding : PaddingValues? = null,
    var enabled: Boolean = true,
    var height: Dp = 0.dp,
    var width: Dp = 0.dp
)

internal data class SpecialCharParams(
    val text: String,
    val isSelected: Boolean
)

/**
 * getPaddingParamsOfSecondRow : This method will provide parameters of A and L key
 * @param keyboardKey : pass key
 * @param buttonParams : pass initial object of ButtonParams
 */
@Composable
internal fun getPaddingParamsOfSecondRow(buttonParams: ButtonParams, keyboardKey: Key) : ButtonParams {
    buttonParams.width = dimensionResource(com.intuit.sdp.R.dimen._42sdp)
    if(keyboardKey is Alphabets.A || keyboardKey is UppercaseAlphabets.A){
        buttonParams.contentPadding = PaddingValues(bottom = dimensionResource(com.intuit.sdp.R.dimen._9sdp), start = dimensionResource(com.intuit.sdp.R.dimen._12sdp),end = content_padding_value)
    } else {
        buttonParams.contentPadding = PaddingValues(bottom = dimensionResource(com.intuit.sdp.R.dimen._9sdp), start = content_padding_value,end = dimensionResource(com.intuit.sdp.R.dimen._12sdp))
    }
    return  buttonParams
}
