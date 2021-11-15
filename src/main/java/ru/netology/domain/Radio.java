package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation = 0;
    private int countStation = 10;
    private int countVolume = 100;

    public Radio(int countStation) {
        this.countStation = countStation - 1;
    }

    public Radio() {
    }

    public int getCountStation() {
        return this.countStation + 1;
    }

    public int getCurrentStation() {
        return this.currentStation;
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

    public void increaseStation() {
        if (this.currentStation < this.countStation) {
            this.currentStation = this.currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (this.currentStation > 0) {
            this.currentStation = this.currentStation - 1;
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
        return this.currentVolume;
    }

    public void increaseVolume() {
        if (this.currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (this.currentVolume > 0) {
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

