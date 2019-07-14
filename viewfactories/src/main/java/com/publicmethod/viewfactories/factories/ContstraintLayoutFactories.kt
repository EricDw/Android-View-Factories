package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout

fun Context.createConstraintLayout(
    init: ConstraintLayout.() -> Unit = {}
) = ConstraintLayout(this).apply {
    id = View.generateViewId()
    layoutParams = constraintMatchParentParams
    init()
}
