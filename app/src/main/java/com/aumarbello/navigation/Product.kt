package com.aumarbello.navigation

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String
): Parcelable