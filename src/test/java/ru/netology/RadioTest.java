package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNoChangeStationOverMax() {
        radio.setCurrentStation(30);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeStationLessMin() {
        radio.setCurrentStation(-10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void souldSetDefaultStation(){
        radio.setCurrentStation(13);
        assertEquals(10,radio.getDefaultStation());
    }
    @Test
    public void shouldSetStation () {
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation () {
        radio.setCurrentStation(10);
        assertEquals(15, radio.getMaxStation());
    }

    @Test
    public void shouldSetMinStation () {
        radio.setCurrentStation(3);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetNextStation () {
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation () {
        radio.setCurrentStation(3);
        radio.previousStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldNoChangeVolumOverMax() {
        radio.setCurrentVolume(110);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNoChangeVolumLessMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume () {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume () {
        radio.setCurrentVolume(30);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume () {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetNextVolume () {
        radio.setCurrentVolume(30);
        radio.increasedCurrentVolume();
        assertEquals(31, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        radio.setCurrentVolume(29);
        radio.decreasedCurrentVolume();
        assertEquals(28, radio.getCurrentVolume());
    }
}
