package com.publicmethod.viewfactories.factories

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.R
import com.publicmethod.viewfactories.TestActivity
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class BottomAppBarFactoryTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun bottomActionBarIsGeneratedWithCorrectId() {
        val expected = R.id.test_app_bar
        activityTestRule.activity.run {
            createBottomAppBar {
                id = expected
            }
        }.also {
            val actual = it.id
            Assert.assertEquals(expected, actual)
        }
    }

}
