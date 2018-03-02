package com.naman14.timber;



import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.contrib.NavigationViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.naman14.timber.activities.MainActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LPSampleTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void openDrawer() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open());

        onView(withId(R.id.nav_view)).perform(NavigationViewActions.navigateTo(R.id.nav_playlists));

        //check each of the nav drawer items opens to the correct screen: Library, Playlist, Folders, Playing Queue, Now Playing,
        //Settings, About, and Support Development
    }

    //Test main menu items: Songs, Albums, and Artists

    //Check that the search function works; check sample input text against actual input test

    //Check overflow menu: Shuffle All, Sort by (and each subitem from A-Z through to Duration), Equalizer, and Settings

    //Test each check/uncheck item on the Settings menu

    //Under Playlist, check songs under Last Added, Recently Played, and My Top Tracks

    //Under Playing Queue, add a song and check that it's added

    //Under Now Playing, add a song and check that it's added. Play a song, pause it, skip forward and back, shuffle, repeat.

    //Hit "OK" on Settings menu

    //Support development tab has an error; would otherwise test the links to products

}
