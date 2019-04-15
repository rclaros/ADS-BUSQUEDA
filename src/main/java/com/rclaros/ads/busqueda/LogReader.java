package com.rclaros.ads.busqueda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LogReader implements Iterable<LogLine> {
    private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Set<String> uniqueIps;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
        this.uniqueIps = new HashSet<String>();
    }

    public Iterator<LogLine> iterator() {
        return new LogReaderIterator(this.sizeLogLines, this.sizeUniqueIps);
    }

    @SuppressWarnings("unused")
    public int readAllLogs() {
        int sizeLogLines = 0;
        for (LogLine line : this) {
            String ip = line.getIP();
            sizeLogLines++;
        }
        return sizeLogLines;
    }

    public int getSizeUniqueIps() {

        for (LogLine logLine : this) {
            String ip = logLine.getIP();
            if (!this.uniqueIps.contains(ip)) {
                this.uniqueIps.add(ip);
            }
        }
        return this.uniqueIps.size();
    }
}
