package com.devosha.materialpreference;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Our ToolBarActivity.
 */
public class ToolbarActivity extends AppCompatActivity {

    /**
     * Setup our ToolBar
     */
    @SuppressWarnings("ConstantConditions")
    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
