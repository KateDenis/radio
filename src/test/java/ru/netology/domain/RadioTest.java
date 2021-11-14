package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rd = new Radio();

    @Test
    public void shouldIncreaseStationOverMax() {
        rd.increaseStation(99);
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
        rd.increaseStation(7);
        int expected = 8;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        rd.decreaseStation(5);
        int expected = 4;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationOverMin() {
        rd.decreaseStation(0);
        int expected = 9;
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
        rd.setCurrentStation(10);
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
        rd.increaseVolume(6);
        int expected = 7;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        rd.increaseVolume(100);
        int expected = 100;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rd.decreaseVolume(5);
        int expected = 4;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOverMin() {
        rd.decreaseVolume(0);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

