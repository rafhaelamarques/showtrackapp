package com.cotemig.showtrack.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Episode(
    @SerializedName("show") @Expose val show: Show,
    @SerializedName("_embedded") @Expose val embedded: Embedded,
)

data class Embedded(@SerializedName("nextepisode") @Expose val nextepisode: NextEpisode)

data class NextEpisode(
    @SerializedName("id") @Expose val id: Int,
    @SerializedName("url") @Expose val url: String,
    @SerializedName("name") @Expose val name: String,
    @SerializedName("season") @Expose val season: String,
    @SerializedName("number") @Expose val number: String,
    @SerializedName("airdate") @Expose val airdate: String,
    @SerializedName("airtime") @Expose val airtime: String,
    @SerializedName("runtime") @Expose val runtime: String,
    @SerializedName("image") @Expose val image: String,
    @SerializedName("summary") @Expose val summary: String,
)