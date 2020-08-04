package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldNoChangeStationOverMax() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeStationLessMin() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetMinStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetNextStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation () {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.previousStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeVolumOverMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNoChangeVolumLessMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume () {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume () {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume () {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetNextVolume () {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        radio.increasedCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        radio.decreasedCurrentVolume();
        assertEquals(2, radio.getCurrentVolume());
    }
}
