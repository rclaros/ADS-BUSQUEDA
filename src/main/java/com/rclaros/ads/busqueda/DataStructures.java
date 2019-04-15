package com.rclaros.ads.busqueda;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class DataStructures {

    private final static int SIZE_LOG_LINES = 100000;
    private final static int SIZE_UNIQUE_IPS = 90001;
    private static LogReader logReader = new LogReader(SIZE_LOG_LINES, SIZE_UNIQUE_IPS);

    public static void main(String[] args) {
        System.out.println("Leyendo los datos...");
        Stopwatch stopwatch = Stopwatch.createStarted();
        int sizeLogLines = logReader.readAllLogs();
        System.out.println("Numero de lineas: " + sizeLogLines);
        System.out.println(String.format("Tiempo transcurrido: %d milisegundos", stopwatch.elapsed(TimeUnit.MILLISECONDS)));

        System.out.println("\nProcesando unicas IPs...");
        stopwatch = Stopwatch.createStarted();
        int sizeUniqueIps = logReader.getSizeUniqueIps();
        System.out.println(String.format("Numeros unicas de ip: %d", sizeUniqueIps));
        System.out.println(String.format("Tiempo transcurrido: %d segundos", stopwatch.elapsed(TimeUnit.SECONDS)));
    }
}
