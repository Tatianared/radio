package ru.netology.radio;

public class Radio {
    private int startNumber = 0;
    private int finishNumber = 9;
    private int stationNumber = startNumber;
    private int size = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int volume;

    public int gerStartNumber() {
        return startNumber;
    }

    public int getFinishNumber() {
        return finishNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public Radio() {

    }

    public Radio(int size) {
        finishNumber = startNumber + size - 1;

    }


    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }


    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < startNumber) {
            return;
        }
        if (newStationNumber > finishNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public int nextNumber() {
        if (stationNumber < finishNumber) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = startNumber;
        }
        return stationNumber;
    }

    public int prevNumber() {
        if (stationNumber > startNumber) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = finishNumber;
        }
        return stationNumber;
    }

    public int plusVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        } else {
            volume = maxVolume;
        }
        return volume;
    }


    public int minusVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
        if (volume <= minVolume) {
            volume = minVolume;
        }
        return volume;
    }
}









