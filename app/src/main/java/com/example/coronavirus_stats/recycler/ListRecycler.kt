package com.example.coronavirus_stats.recycler

import com.google.gson.annotations.SerializedName

data class ListRecycler(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Int,
    @SerializedName("type")
    val type: String
)

data class Data(
    @SerializedName("change")
    val change: Change,
    @SerializedName("generated_on")
    val generatedOn: Int,
    @SerializedName("States")
    val State: States,
    @SerializedName("summary")
    val summary: Summary
)

data class Change(
    @SerializedName("active_cases")
    val activeCases: Int,
    @SerializedName("critical")
    val critical: Int,
    @SerializedName("death_ratio")
    val deathRatio: Double,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("recovered")
    val recovered: Int,
    @SerializedName("recovery_ratio")
    val recoveryRatio: Double,
    @SerializedName("tested")
    val tested: Int,
    @SerializedName("total_cases")
    val totalCases: Int
)

data class States(
    @SerializedName("belgium")
    val belgium: State,
    @SerializedName("brazil")
    val brazil: State,
    @SerializedName("british_virgin_islands")
    val britishVirginIslands: State,
    @SerializedName("brunei")
    val brunei: State,
    @SerializedName("bulgaria")
    val bulgaria: State,
    @SerializedName("canada")
    val canada: State,
    @SerializedName("denmark")
    val denmark: State,
    @SerializedName("finland")
    val finland: State,
    @SerializedName("france")
    val france: State,
    @SerializedName("germany")
    val germany: State,
    @SerializedName("greece")
    val greece: State,
    @SerializedName("greenland")
    val greenland: State,
    @SerializedName("india")
    val india: State,
    @SerializedName("italy")
    val italy: State,
    @SerializedName("japan")
    val japan: State,
    @SerializedName("luxembourg")
    val luxembourg: State,
    @SerializedName("mexico")
    val mexico: State,
    @SerializedName("poland")
    val poland: State,
    @SerializedName("portugal")
    val portugal: State,
    @SerializedName("russia")
    val russia: State,
    @SerializedName("spain")
    val spain: State,
    @SerializedName("sweden")
    val sweden: State,
    @SerializedName("switzerland")
    val switzerland: State,
    @SerializedName("uk")
    val uk: State,
    @SerializedName("usa")
    val usa: State,
) {
    fun toArrayList(): ArrayList<State> = arrayListOf(
        this.belgium,
        this.brazil,
        this.britishVirginIslands,
        this.brunei,
        this.bulgaria,
        this.canada,
        this.denmark,
        this.finland,
        this.france,
        this.germany,
        this.greece,
        this.greenland,
        this.india,
        this.italy,
        this.japan,
        this.luxembourg,
        this.mexico,
        this.poland,
        this.portugal,
        this.russia,
        this.spain,
        this.sweden,
        this.switzerland,
        this.uk,
        this.usa,
    )
}

data class State(
    @SerializedName("active_cases")
    val activeCases: Int,
    @SerializedName("change")
    val change: Change,
    @SerializedName("critical")
    val critical: Int,
    @SerializedName("death_ratio")
    val deathRatio: Double,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("iso3166a2")
    val iso3166a2: String,
    @SerializedName("iso3166a3")
    val iso3166a3: String,
    @SerializedName("iso3166numeric")
    val iso3166numeric: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("recovered")
    val recovered: Int,
    @SerializedName("recovery_ratio")
    val recoveryRatio: Double,
    @SerializedName("tested")
    val tested: Int,
    @SerializedName("total_cases")
    val totalCases: Int
)

data class Summary(
    @SerializedName("active_cases")
    val activeCases: Int,
    @SerializedName("critical")
    val critical: Int,
    @SerializedName("death_ratio")
    val deathRatio: Double,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("recovered")
    val recovered: Int,
    @SerializedName("recovery_ratio")
    val recoveryRatio: Double,
    @SerializedName("tested")
    val tested: Int,
    @SerializedName("total_cases")
    val totalCases: Int
)