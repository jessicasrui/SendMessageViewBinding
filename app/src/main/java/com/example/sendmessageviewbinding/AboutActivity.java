package com.example.sendmessageviewbinding;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.danielstone.materialaboutlibrary.ConvenienceBuilder;
import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

public class AboutActivity extends MaterialAboutActivity {

    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        MaterialAboutCard.Builder autorCardBuilder = new MaterialAboutCard.Builder();
        autorCardBuilder.title(R.string.autor_aboutas);
        autorCardBuilder.cardColor(getColor(R.color.md_theme_light_tertiary));
        autorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Jessica Castro Ruiz")
                .subText("Alum. módulo DEINT")
                .icon(R.mipmap.usuario)
                .build()
        );

        autorCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text(R.string.enlace_aboutas)
                .icon(R.mipmap.github)
                .setOnClickAction(ConvenienceBuilder.createWebsiteOnClickAction(context, Uri.parse("https://github.com/jessicasrui")))
                .build()
        );

        MaterialAboutCard.Builder versionCardBuilder = new MaterialAboutCard.Builder();
        //autorCardBuilder.title("Versión");
        versionCardBuilder.cardColor(getColor(R.color.md_theme_light_tertiary));
        versionCardBuilder.addItem(new MaterialAboutActionItem.Builder()
                .text("Version")
                .subText("1.0.0")
                .icon(R.mipmap.informacion)
                .build()
        );

        return new MaterialAboutList(autorCardBuilder.build(), versionCardBuilder.build());
    }


    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.menu_aboutas);
    }

}
