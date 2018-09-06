package com.devosha.materialpreference;

import android.os.Bundle;
import com.yarolegovich.mp.MaterialPreferenceScreen;
import java.util.Arrays;

/**
 * Our SettingsActivity Activity.
 * This class derives from ToolbarActivity.
 */
public class SettingsActivity extends ToolbarActivity {

    /**
     * Our onCreate() method.
     * First we set the activity_settings layout as our content view.
     * Then we setup the toolbar by invoking the `setupToolbar()` method defined in
     * the ToolbarActivity.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setupToolbar();

        MaterialPreferenceScreen screen = findViewById(R.id.preference_screen);
        screen.setVisibilityController(R.id.pref_auto_loc, Arrays.asList(R.id.pref_location), false);
    }

}

