package com.amadeus.lvlup.feature_dashboard.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AnalyticsData(
    val type: String,
    val title: String,
    val numerical: String,
    @PrimaryKey val id: Int?=null
){
    companion object{
        //Listing possible colors for each report
    }
}
