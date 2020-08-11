package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

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

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void previousStation() {
        int previousStation = currentStation - 1;
        if (previousStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = previousStation;
        }
    }

    public void nextStation() {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = nextStation;
        }
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

    public void increasedCurrentVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }

    public void decreasedCurrentVolume() {
        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
            return;
        }
        this.currentVolume = previousVolume;
    }
}

