package ru.netology.domain;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void myTest() {
        Radio rd = new Radio();
        rd.turnOn("Kate");
        System.out.println(rd.getCurrentVolume());
    }

    @Test
    public void myTest2() {
        Radio rd = new Radio();
        rd.turnOn("Kate");
        rd.setCurrentStation(7);
        int expected = 7;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest3(){
        Radio rd = new Radio();
        rd.turnOn("Kate");
        rd.setToMax();
        int expected = 10;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

