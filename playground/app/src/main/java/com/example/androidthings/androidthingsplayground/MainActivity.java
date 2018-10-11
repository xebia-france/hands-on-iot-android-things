package com.example.androidthings.androidthingsplayground;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.things.pio.Gpio;

public class MainActivity extends Activity {

    private static String GPIO_RED_LED = "GPIO2_IO02";
    private static String GPIO_GREEN_LED = "GPIO2_IO00";
    private static String GPIO_BLUE_LED = "GPIO2_IO05";

    private Gpio redLed;
    private Gpio blueLed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO Light up the red led and blue led
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // TODO close resource
    }
}
