package com.github.karlicoss.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

@RunWith(RobolectricGradleTestRunner.class)
@Config(sdk = 21, constants = BuildConfig.class)
public class MainActivityTest {
    @Test
    public void testActivityDemo() {
        final ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
        controller
                .create()
                .start()
                .resume();

        controller
                .pause()
                .stop()
                .destroy();
    }
}