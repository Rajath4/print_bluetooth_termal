package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new io.flutter.plugins.deviceinfo.DeviceInfoPlugin());
      com.cingulo.device_unlock.DeviceUnlockPlugin.registerWith(shimPluginRegistry.registrarFor("com.cingulo.device_unlock.DeviceUnlockPlugin"));
      de.esys.esysfluttershare.EsysFlutterSharePlugin.registerWith(shimPluginRegistry.registrarFor("de.esys.esysfluttershare.EsysFlutterSharePlugin"));
    flutterEngine.getPlugins().add(new com.mr.flutter.plugin.filepicker.FilePickerPlugin());
      com.afur.flutterhtmltopdf.FlutterHtmlToPdfPlugin.registerWith(shimPluginRegistry.registrarFor("com.afur.flutterhtmltopdf.FlutterHtmlToPdfPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    flutterEngine.getPlugins().add(new com.di1shuai.platform_device_id.PlatformDeviceIdPlugin());
    flutterEngine.getPlugins().add(new app.web.groons.print_bluetooth_thermal.PrintBluetoothThermalPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
  }
}
