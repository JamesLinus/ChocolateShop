package com.google.chocolateshop

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class ChocolateShop : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chocolate_shop)

        // Enables Always-on
        setAmbientEnabled()
    }
}
