import kotlin.system.measureNanoTime
    var arreglos = Array(10, { i -> i + 1 })
    fun main() {
        var a = 5
        var total = 0
        var tiempo = measureNanoTime {
            for (i in arreglos.indices) {
                total += arreglos[i]
            }
            println("resultado: $total \n")
        }
        println("Tiempo ciclo= $tiempo nanosegundos")
        println("----------------------------------")
        var tiempo2 = measureNanoTime {
            var total_Recursivo = recursivo_Suma(arreglos.size - 1)
            println("resultado recursivo: $total_Recursivo \n")
        }
        println("Tiempo recursivo= $tiempo2 nanosegundos")
    }
    fun recursivo(num: Int): Int {
        if (num == 1)
            return 1
        return num * recursivo(num - 1)
    }
    fun recursivo_Suma(pos: Int): Int {
        if (pos == 0)
            return arreglos[pos]
        return arreglos[pos] + recursivo_Suma(pos - 1)
    }

