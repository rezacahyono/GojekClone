package com.rchyn.gojekclone.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Promo(
    @DrawableRes
    val imgSrc: Int,
    @StringRes
    val title: Int,
    @StringRes
    val distance: Int,
    @StringRes
    val rating: Int
)