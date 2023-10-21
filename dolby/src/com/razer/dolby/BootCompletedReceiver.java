/*
 * Copyright (C) 2023 Paranoid Android
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.razer.dolby;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.razer.dolby.DolbyUtils;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final String TAG = "RazerDolby";
    private static final boolean DEBUG = true;

    @Override
    public void onReceive(final Context context, Intent intent) {
        if (!intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            return;
        }
        if (DEBUG) Log.d(TAG, "Received boot completed intent");
        DolbyUtils.getInstance(context);
    }
}