package com.rclaros.ads.busqueda;

public class LogLine {
    int counter;

    public LogLine(int counter) {
        this.counter = counter;
    }

    public String getIP() {
        return "ip-" + counter;
    }
}
