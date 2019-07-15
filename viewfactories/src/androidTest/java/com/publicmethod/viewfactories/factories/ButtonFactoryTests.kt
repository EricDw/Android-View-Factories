package com.publicmethod.viewfactories.factories

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.R
import com.publicmethod.viewfactories.TestActivity
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonFactoryTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun buttonIsGeneratedWithCorrectId() {
        val expected = R.id.test_button
        activityTestRule.activity.run {
            createButton {
                id = expected
            }
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }
}
