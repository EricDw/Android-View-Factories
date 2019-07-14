package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout

fun Context.createCoordinatorLayout(
    init: CoordinatorLayout.() -> Unit = {}
) = CoordinatorLayout(this).apply {

    id = View.generateViewId()

    layoutParams = coordinatorMatchParentParams

    init()
}
