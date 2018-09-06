package com.devosha.materialpreference;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yarolegovich.mp.MaterialPreferenceScreen;

/**
 * Our FormActivity. Derives from ToolbarActivity.
 * Use the {@link FormInitializer} class to save the Form state, restore it and
 * set it as the storage module of our MaterialPreferenceScreen.
 */
public class FormActivity extends ToolbarActivity {

    private Form form = new Form();

    /**
     * Our onCreate() callback.
     * First we reference our MaterialPreferenceScreen from our `activity_form`.
     * Then we instantiate our FormInitializer and restore the Form state.
     * Then we set our StorageModule, which is the FormInitializer class to the
     * {@link MaterialPreferenceScreen}
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        setupToolbar();

        MaterialPreferenceScreen screen = (MaterialPreferenceScreen) findViewById(R.id.preference_screen);
        FormInitializer formInitializer = new FormInitializer(form);
        formInitializer.onRestoreInstanceState(savedInstanceState);
        screen.setStorageModule(formInitializer);
    }

    /**
     * Save the Form state
     * @param outState - Bundle object to hold the Form state.
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        new FormInitializer(form).onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    /**
     * Our `submitForm()`.
     * This method will simply show the submitted values in a Toast message.
     * @param v - View object.
     */
    public void submitForm(View v) {
        Toast.makeText(this,
                "Form submitted!\n" + form.toString(),
                Toast.LENGTH_SHORT)
                .show();
    }
    //end
}
