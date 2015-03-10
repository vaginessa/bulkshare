package me.alexghr.android.bulkshare;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        String theme = settings.getString(getString(me.alexghr.android.bulkshare.R.string.pref_theme_key), "0");
        if (theme.equals(getString(me.alexghr.android.bulkshare.R.string.pref_theme_holo_dark_value))) {
            setTheme(android.R.style.Theme_Holo);
        } else {
            setTheme(android.R.style.Theme_Holo_Light);
        }

        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();

        super.onCreate(savedInstanceState);
    }
}