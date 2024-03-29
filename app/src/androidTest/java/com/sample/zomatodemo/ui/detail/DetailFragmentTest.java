package com.sample.zomatodemo.ui.detail;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.widget.TextView;

import com.sample.zomatodemo.R;
import com.sample.zomatodemo.data.response.searchdata.RestaurantInfo;
import com.sample.zomatodemo.ui.home.HomeActivity;

import org.hamcrest.Matcher;
import org.hamcrest.core.AllOf;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread;
import static org.hamcrest.core.StringContains.containsString;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DetailFragmentTest {

    @Rule
    public ActivityTestRule<HomeActivity> mActivityRule = new ActivityTestRule<>(HomeActivity.class);

    @Before
    public void setUp() throws Throwable {
        runOnUiThread(() -> mActivityRule.getActivity().loadDetailFragment(new RestaurantInfo()));
    }

    @Test
    public void check_detail_thumb_url() {
        onView(withId(R.id.detail_thumb)).check(matches(isDisplayed()));
    }

    @Test
    public void check_detail_restaurant_name() {
        String name="Wangs Kitchen";
        onView(withId(R.id.detail_name)).check(matches(isDisplayed()));
        onView(withId(R.id.detail_name)).perform(setTextInTextView(name));
        onView(withId(R.id.detail_name)).check(matches(withText(containsString(name))));
    }

    @Test
    public void check_detail_city_location() {
        String cityName="bengaluru";
        onView(withId(R.id.detail_location)).check(matches(isDisplayed()));
        onView(withId(R.id.detail_location)).perform(setTextInTextView(cityName));
        onView(withId(R.id.detail_location)).check(matches(withText(containsString(cityName))));
    }

    @Test
    public void check_detail_city_rating() {
        String rating="2.7";
        onView(withId(R.id.detail_rating)).check(matches(isDisplayed()));
        onView(withId(R.id.detail_rating)).perform(setTextInTextView(rating));
        onView(withId(R.id.detail_rating)).check(matches(withText(containsString(rating))));
    }

    public static ViewAction setTextInTextView(final String value){
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return AllOf.allOf(isDisplayed(), isAssignableFrom(TextView.class));
            }

            @Override
            public void perform(UiController uiController, View view) {
                ((TextView) view).setText(value);
            }

            @Override
            public String getDescription() {
                return "replace text";
            }
        };
    }
}
