package com.publicmethod.viewfactories.factories

import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.R
import com.publicmethod.viewfactories.TestActivity
import org.junit.Test

import org.junit.Assert.*

class EditTextViewFactoryTests: BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun editTextViewIsGeneratedWithCorrectId() {
        val expected = R.id.test_edit_text
        activityTestRule.activity.run {
            createEditTextView {
                id = expected
            }
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }

}