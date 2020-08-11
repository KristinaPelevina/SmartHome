package ru.netology;

public class Radio {
    private String name;
    private int currentStation;
    private int defaultStation = 10;
    private int minStation = 0;
    private int maxStation = 15;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation){
            return;
        }
        if (currentStation < minStation){
            return;
        }
         this.currentStation = currentStation;
    }

    public void previousStation () {
        int previousStation = currentStation - 1;
        if (previousStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = previousStation;
        }
    }

    public void nextStation () {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = nextStation;
        }
    }

    public int getDefaultStation() {
        return defaultStation;
    }

    public void setDefaultStation(int defaultStation) {
        this.defaultStation = defaultStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increasedCurrentVolume () {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }

    public void decreasedCurrentVolume () {
        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
           return;
        }
        this.currentVolume = previousVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
