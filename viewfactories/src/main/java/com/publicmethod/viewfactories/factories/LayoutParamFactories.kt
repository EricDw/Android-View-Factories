package com.publicmethod.viewfactories.factories

import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout

val constraintMatchParentParams: ConstraintLayout.LayoutParams
    get() = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.MATCH_PARENT,
        ConstraintLayout.LayoutParams.MATCH_PARENT
    )

val coordinatorMatchParentParams: CoordinatorLayout.LayoutParams
    get() = CoordinatorLayout.LayoutParams(
        CoordinatorLayout.LayoutParams.MATCH_PARENT,
        CoordinatorLayout.LayoutParams.MATCH_PARENT
    )

val viewGroupWrapContentParams: ViewGroup.LayoutParams
    get() = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )

val viewGroupMatchParentParams: ViewGroup.LayoutParams
    get() = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT
    )

val marginMatchParentParams: ViewGroup.MarginLayoutParams
    get() = ViewGroup.MarginLayoutParams(
        ViewGroup.MarginLayoutParams.MATCH_PARENT,
        ViewGroup.MarginLayoutParams.MATCH_PARENT
    )

val marginMatchParentWidthParams: ViewGroup.MarginLayoutParams
    get() = ViewGroup.MarginLayoutParams(
        ViewGroup.MarginLayoutParams.MATCH_PARENT,
        ViewGroup.MarginLayoutParams.WRAP_CONTENT
    )

val viewGroupMatchParentWidthParams: ViewGroup.LayoutParams
    get() = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
