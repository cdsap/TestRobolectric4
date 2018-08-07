package com.inaki.robolectric4


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testHelloWorldOnTextView() {
        onView(withId(R.id.hello)).check(matches(withText("Hello World!")))
    }
}