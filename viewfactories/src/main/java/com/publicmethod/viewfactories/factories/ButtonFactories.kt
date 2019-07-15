package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun Context.createButton(
    init: Button.() -> Unit = {}
) = Button(this).apply {
    id = View.generateViewId()
    layoutParams = viewGroupWrapContentParams
    init()
}
