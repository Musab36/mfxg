package com.salajim.musab.mfxg.models;

public class Signals {
    String id;
    String pair;
    String entry;
    String takeProfit;
    String stopLoss;

    public Signals() {}

    public Signals(String id, String pair, String entry, String takeProfit, String stopLoss) {
        this.id = id;
        this.pair = pair;
        this.entry = entry;
        this.takeProfit = takeProfit;
        this.stopLoss = stopLoss;
    }

    public String getId() {
        return id;
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
