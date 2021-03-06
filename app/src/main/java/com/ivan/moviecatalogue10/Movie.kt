package com.ivan.moviecatalogue10

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(

    @SerializedName("title")
    val title : String?,

    @SerializedName ("overview")
    val overview :String ?,

    @SerializedName("poster_path")
    val poster_path : String?,

    @SerializedName("release_date")
    val release_date : String?,

    @SerializedName("original_language")
    val original_language : String?

) : Parcelable {
    constructor() : this("","","","","")

}