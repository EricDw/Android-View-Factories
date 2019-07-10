package com.publicmethod.viewfactories.theme

import android.view.Gravity
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.updateMargins
import androidx.transition.Slide
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.publicmethod.viewfactories.dp
import com.publicmethod.viewfactories.dpf

fun <V : FloatingActionButton> V.themeWithConstraintMargins(): V =
    apply {
        layoutParams = ConstraintLayout.LayoutParams(
            layoutParams
        ).apply {
            updateMargins(
                dp(16),
                dp(16),
                dp(16),
                dp(16)
            )
            requestLayout()
        }
    }

fun <V : FloatingActionButton> V.themeWithBottomAppBarMargins(
    @IdRes appBarId: Int,
    anchorGravityFlag: Int = Gravity.END
): V =
    apply {
        layoutParams = CoordinatorLayout.LayoutParams(
            layoutParams
        ).apply {
//            anchorGravity = anchorGravityFlag
            anchorId = appBarId
//            updateMargins(
//                dp(16),
//                dp(16),
//                dp(16),
//                dp(16)
//            )
            requestLayout()
        }
    }