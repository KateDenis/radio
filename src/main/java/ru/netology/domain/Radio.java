package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int countStation = 9;
    private int countVolume = 10;

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

    public void increaseStation() {
        if (currentStation < this.countStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = this.countStation;
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

    public void increaseVolume() {
        if (this.currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > this.countVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

