package com.example.sendmessageviewbinding;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

public class AboutActivity extends MaterialAboutActivity {

    @NonNull
    @Override
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        return new MaterialAboutList.Builder().build(); // This creates an empty screen, add cards with .addCard()
    }

    @Nullable
    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.main_aboutas);
    }
}
