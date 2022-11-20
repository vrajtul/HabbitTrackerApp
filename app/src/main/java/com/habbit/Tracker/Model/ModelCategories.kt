package com.habbit.Tracker.Model

import android.icu.text.CaseMap.Title
import java.util.Timer

class ModelCategories {

    var title: String? = null
    var iconIdImg: Int? = null
    var iconId: Int? = null

    constructor(title: String, iconIdImg: Int, iconId: Int) {
        this.title = title
        this.iconIdImg = iconIdImg
        this.iconId = iconId
    }

}