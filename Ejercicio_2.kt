class ProductoInventario(
    val codigo: String,
    val nombre: String,
    private var precio: Double,
    private var stock: Int
) {

    fun consultarPrecio(): Double {
        return precio
    }

    fun consultarStock(): Int {
        return stock
    }

    fun aumentarStock(cantidad: Int) {
        if (cantidad > 0) {
            stock += cantidad
        }
    }

    fun disminuirStock(cantidad: Int) {
        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad
        } else {
            println("No hay suficiente stock.")
        }
    }

    fun cambiarPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("Error: el precio no puede ser negativo.")
        }
    }
}

fun main() {

    val producto = ProductoInventario(
        "P001",
        "Laptop",
        850.0,
        10
    )

    println("Precio: ${producto.consultarPrecio()}")
    println("Stock: ${producto.consultarStock()}")

    producto.aumentarStock(5)
    producto.disminuirStock(3)
    producto.cambiarPrecio(950.0)

    println()
    println("Precio actualizado: ${producto.consultarPrecio()}")
    println("Stock actualizado: ${producto.consultarStock()}")
}