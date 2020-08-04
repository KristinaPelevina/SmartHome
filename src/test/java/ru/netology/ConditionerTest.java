package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
        @Test
        public void shouldNotSetTemperatureLessMin() {
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(30);
            conditioner.setMinTemperature(10);
            conditioner.setCurrentTemperature(-35);
            assertEquals(0, conditioner.getCurrentTemperature());
        }

        @Test
        public void shouldNotSetTemperatureOverMax() {
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(30);
            conditioner.setMinTemperature(10);
            conditioner.setCurrentTemperature(35);
            assertEquals(0, conditioner.getCurrentTemperature());
        }

        @Test
        public void shouldIncreaseTemperature () {
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(30);
            conditioner.setMinTemperature(10);
            conditioner.setCurrentTemperature(13);
            conditioner.increaseCurrentTemperature();
            assertEquals(14, conditioner.getCurrentTemperature());
        }

        @Test
        public void shouldDecreaseTemperature () {
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(30);
            conditioner.setMinTemperature(10);
            conditioner.setCurrentTemperature(14);
            conditioner.decreaseCurrentTemperature();
            assertEquals(13, conditioner.getCurrentTemperature());
        }

        @Test
        public void shouldNotIncreaseTemperatureOverMax () {
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(30);
            conditioner.setMinTemperature(10);
            conditioner.setCurrentTemperature(30);
            conditioner.increaseCurrentTemperature();
            assertEquals(30, conditioner.getCurrentTemperature());
        }

        @Test
        public void shouldNotDecreaseTemperatureOverMax () {
           Conditioner conditioner = new Conditioner();
           conditioner.setMaxTemperature(30);
           conditioner.setMinTemperature(10);
           conditioner.setCurrentTemperature(10);
           conditioner.decreaseCurrentTemperature();
           assertEquals(10, conditioner.getCurrentTemperature());
    }
}
