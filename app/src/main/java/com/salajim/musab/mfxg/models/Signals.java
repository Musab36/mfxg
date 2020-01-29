package com.salajim.musab.mfxg.models;

public class Signals {
    String pair;
    String entry;
    String takeProfit;
    String stopLoss;

    public Signals() {}

    public Signals(String pair, String entry, String takeProfit, String stopLoss) {
        this.pair = pair;
        this.entry = entry;
        this.takeProfit = takeProfit;
        this.stopLoss = stopLoss;
    }

    public String getPair() {
        return pair;
    }

    public String getEntry() {
        return entry;
    }

    public String getTakeProfit() {
        return takeProfit;
    }

    public String getStopLoss() {
        return stopLoss;
    }


}
