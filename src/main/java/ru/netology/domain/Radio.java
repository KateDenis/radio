package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation(int currentStation) {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void decreaseStation(int currentStation) {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = 9;
        }
    }

    public void setToMax() {
        this.currentVolume = 10;
    }

    public void setToMin() {
        this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }

}

