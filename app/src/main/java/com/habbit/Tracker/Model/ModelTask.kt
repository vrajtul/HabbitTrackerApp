package com.habbit.Tracker.Model

import android.icu.text.CaseMap.Title
import java.util.Timer

class ModelTask {

    var title: String? = null
    var time: String? = null

    constructor(title: String, time: String) {
        this.title = title
        this.time = time
    }

}