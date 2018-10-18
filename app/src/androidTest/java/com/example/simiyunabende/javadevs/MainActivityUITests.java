package com.example.simiyunabende.javadevs;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.simiyunabende.javadevs.view.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITests {
        @Rule
        public ActivityTestRule<MainActivity> activity = new ActivityTestRule<MainActivity>(MainActivity.class);
        @Test
        public void clickItemOnRecycler() throws Exception {
            onView(withId(R.id.recyclerview))
                    .perform(RecyclerViewActions.scrollToPosition(0))
                    .perform(click());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            onView(withId(R.id.recyclerview))
                    .perform(
                            RecyclerViewActions.actionOnItemAtPosition(1, click())
                    );
            pressBack();
        }
}
