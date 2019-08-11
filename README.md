## busqueda-optimizacion

Diferencia de tiempos utilizando Listas con nivel de complejidad O(N) y Lista con nivel de complejidad O(1)

Notación O(N).

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
Notacioón O(1)
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
Resultados de tiempos.
```
Leyendo los datos...
Número de lineas: 100000
Tiempo transcurrido: 30 milisegundos

Procesando unicas IPs...
Números únicas de ip: 90001
Tiempo transcurrido: 0 segundos

```
