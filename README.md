EPF IoT class Hands-on 
======================

This is a fork of [Android Things weather station codelab](https://codelabs.developers.google.com/codelabs/androidthings-weatherstation), prepared for EPF IoT course 2018-2019.

# Prerequisite

- A PC or a Mac with latest [Android Studio](https://developer.android.com/studio/) installed
- An Android Things starter kit with the latest image installed
- Basic knowledge of Linux/Unix system
- Basic knowledge of Android development

# Preparation

The board given to each of you is already flashed with the latest version of Android Things.

## Set up your Android Things board

First plug the wifi antenna, then the Rainbow HAT onto your Pico board.

![board_with_wifi_antenna](img/board_wifi_antenna.jpg)

![board_with_rainbow_hat](img/board_rainbow_hat.jpg)

## Set up ADB

Make sure you already installed the latest stable release of Android Studio. Go to `menu -> Preferences -> Android SDK` and find your Android SDK location (e.g. `/Users/qian/Library/Android/sdk/`)
- Add SDK's `platform-tools` to your path. An example for MAC user, add following line in your `.bash_profile` or `.bashrc`:

```
export PATH="/Users/qian/Library/Android/sdk/platform-tools:$PATH"
```

This will allow you to use ADB (Android Debug Bridge) easily from a terminal. Once you have adb ready, plug Android Things board and verify if it's properly connected:

```
$ adb devices
List of devices attached
xxxxxx  device
```

Make sure you can access adb shell:
```
$ adb shell
imx7d_pico:/ $ 
```

## Other setups

If you need do some further setups (flashing board, set up wifi...), download the [Android Things Setup Utility](https://partner.android.com/things/console/#/tools) from the Android Things Console. You will need to sign in to your Google account and accept the licensing agreement and terms of service.

# Get Started

# About the Hardware

# ADB commands

# 


# Reference

- https://github.com/androidthings/weatherstation