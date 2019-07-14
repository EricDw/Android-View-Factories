package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.widget.EditText


fun Context.createEditTextView(init: EditText.() -> Unit) =
    EditText(this).apply {
        id = View.generateViewId()
        layoutParams = viewGroupWrapContentParams
        init()
    }