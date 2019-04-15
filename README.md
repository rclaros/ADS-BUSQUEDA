# ADS-BUSQUEDA

Cambios realizado sobre la estructura de datos.

Antes
```
private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Collection<String> uniqueIps;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
        this.uniqueIps = new ArrayList<String>();
    }
```
Despues
```
public class LogReader implements Iterable<LogLine> {
    private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Set<String> uniqueIps;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
        this.uniqueIps = new HashSet<String>();
    }
```
Resultados.
```
Leyendo los datos...
Número de lineas: 100000
Tiempo transcurrido: 30 milisegundos

Procesando unicas IPs...
Números únicas de ip: 90001
Tiempo transcurrido: 0 segundos

```
