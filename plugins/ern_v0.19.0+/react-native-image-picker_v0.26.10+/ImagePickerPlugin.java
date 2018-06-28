package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;

import com.imagepicker.ImagePickerPackage;

public class ImagePickerPlugin {

  public ReactPackage hook(@NonNull Application application,
                           ReactPluginConfig config) {
      ImagePicker imagePicker = new ImagePickerPackage();
      return imagePicker;
    }

}
