open class Vehiculo(
    val marca: String,
    val modelo: String,
    val anio: Int
) {

    open fun mostrarDatos() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
    }
}

class Auto(
    marca: String,
    modelo: String,
    anio: Int,
    val numeroPuertas: Int
) : Vehiculo(marca, modelo, anio) {

    override fun mostrarDatos() {
        println("=== AUTO ===")
        super.mostrarDatos()
        println("Número de puertas: $numeroPuertas")
    }
}

class Motocicleta(
    marca: String,
    modelo: String,
    anio: Int,
    val cilindrada: Int
) : Vehiculo(marca, modelo, anio) {

    override fun mostrarDatos() {
        println("=== MOTOCICLETA ===")
        super.mostrarDatos()
        println("Cilindrada: $cilindrada cc")
    }
}

fun main() {

    val auto = Auto(
        "Toyota",
        "Corolla",
        2024,
        4
    )

    val moto = Motocicleta(
        "Yamaha",
        "R15",
        2023,
        155
    )

    auto.mostrarDatos()

    println()

    moto.mostrarDatos()
}