package com.Ali_OUABED.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureSensorTest {
    @Test
    public void testTemperatureUpdate() {
        TemperatureSensor sensor = new TemperatureSensor();
        TemperatureDisplay display = new TemperatureDisplay();

        sensor.registerObserver(display);
        sensor.setTemperature(25.0f);

          }
}
