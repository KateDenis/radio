package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rd = new Radio();

    @Test
    public void shouldIncreaseStationOverMax() {
        rd.setCurrentStation(10);
        rd.increaseStation();
        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldInitCountStationConstructor() {
        int expected = 7;
        Radio rd = new Radio(expected);
        int actual = rd.getCountStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {
        rd.setCurrentStation(7);
        rd.increaseStation();
        int expected = 8;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        rd.setCurrentStation(5);
        rd.decreaseStation();
        int expected = 4;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationOverMin() {
        rd.setCurrentStation(0);
        rd.decreaseStation();
        int expected = 10;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        rd.setCurrentStation(1);
        int expected = 1;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOverMin() {
        rd.setCurrentStation(-1);
        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOverMax() {
        rd.setCurrentStation(11);
        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMax() {
        rd.setToMax();
        int expected = 100;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMin() {
        rd.setToMin();
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        rd.setCurrentVolume(6);
        rd.increaseVolume();
        int expected = 7;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        rd.setToMax();
        rd.increaseVolume();
        int expected = 100;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rd.setCurrentVolume(5);
        rd.decreaseVolume();
        int expected = 4;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOverMin() {
        rd.setCurrentVolume(0);
        rd.decreaseVolume();
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        rd.setCurrentVolume(1);
        int expected = 1;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeOverMin() {
        rd.setToMin();
        rd.setCurrentVolume(-1);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeOverMax() {
        rd.setToMax();
        rd.setCurrentVolume(101);
        int expected = 100;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

