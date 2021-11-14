package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int countStation = 9;

    public Radio(int countStation) {
        this.countStation = countStation -1;
    }

    public Radio() {
    }

    public int getCountStation() {
        return countStation + 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > this.countStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation(int currentStation) {
        if (currentStation < this.countStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void decreaseStation(int currentStation) {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = this.countStation;
        }
    }

    public void setToMax() {
        this.currentVolume = 100;
    }

    public void setToMin() {
        this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 100;
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

