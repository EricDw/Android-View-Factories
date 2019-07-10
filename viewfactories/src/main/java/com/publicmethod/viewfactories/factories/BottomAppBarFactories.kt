package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomappbar.BottomAppBar.FAB_ALIGNMENT_MODE_END
import com.publicmethod.viewfactories.dp
import com.publicmethod.viewfactories.dpf

fun Context.createBottomAppBar(
    init: BottomAppBar.() -> Unit = {}
) = BottomAppBar(this).apply {

    id = View.generateViewId()

    layoutParams = CoordinatorLayout.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        dp(50)
    ).apply {
        fabCradleMargin = dpf(5f)
        fabAlignmentMode = FAB_ALIGNMENT_MODE_END
        gravity = Gravity.BOTTOM
    }
    init()
}
