package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.react.ReactPackage;

import com.reactnative.ivpusic.imagepicker.PickerPackage;

public class ImageCropPickerPlugin {

  public ReactPackage hook(@NonNull Application application,
                           ReactPluginConfig config) {
    PickerPackage picker = new PickerPackage();
    return picker;
  }
}
