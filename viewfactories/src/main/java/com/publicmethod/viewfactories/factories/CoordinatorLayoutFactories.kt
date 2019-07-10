package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout

fun Context.createCoordinatorLayout(
    init: CoordinatorLayout.() -> Unit = {}
) = CoordinatorLayout(this).apply {

    id = View.generateViewId()

    layoutParams = CoordinatorLayout.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT
    )

    init()
}
