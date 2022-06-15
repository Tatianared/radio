package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int volume;


    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }


    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public int nextNumber() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
        return stationNumber;
    }

    public int prevNumber() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
        return stationNumber;
    }

    public int plusVolume() {
        if (volume > 0) {
            volume = volume + 1;
        }
        if (volume > 10) {
            volume = 10;
        }
        return volume;
    }

    public int minusVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
        if (volume <= 0) {
            volume = 0;
        }
        return volume;
    }
}










