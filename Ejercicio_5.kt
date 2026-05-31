class Libro(
    val id: Int,
    val titulo: String,
    val autor: String
) {

    private var disponible = true

    fun estaDisponible(): Boolean {
        return disponible
    }

    fun prestar(): Boolean {

        return if (disponible) {
            disponible = false
            true
        } else {
            false
        }
    }

    fun devolver(): Boolean {

        return if (!disponible) {
            disponible = true
            true
        } else {
            false
        }
    }

    fun mostrarInfo() {

        println(
            "ID: $id | Título: $titulo | Autor: $autor | Estado: ${
                if (disponible) "Disponible" else "Prestado"
            }"
        )
    }
}

class Biblioteca {

    private val libros = mutableListOf<Libro>()

    fun registrarLibro(libro: Libro) {
        libros.add(libro)
    }

    fun listarLibrosDisponibles() {

        println("=== LIBROS DISPONIBLES ===")

        libros.filter { it.estaDisponible() }
            .forEach { it.mostrarInfo() }
    }

    fun prestarLibro(id: Int) {

        val libro = libros.find { it.id == id }

        if (libro == null) {
            println("Libro no encontrado.")
            return
        }

        if (libro.prestar()) {
            println("Libro prestado correctamente.")
        } else {
            println("El libro ya está prestado.")
        }
    }

    fun devolverLibro(id: Int) {

        val libro = libros.find { it.id == id }

        if (libro == null) {
            println("Libro no encontrado.")
            return
        }

        if (libro.devolver()) {
            println("Libro devuelto correctamente.")
        } else {
            println("El libro ya estaba disponible.")
        }
    }

    fun buscarPorTitulo(titulo: String) {

        val encontrados = libros.filter {
            it.titulo.contains(titulo, ignoreCase = true)
        }

        if (encontrados.isEmpty()) {
            println("No se encontraron libros.")
        } else {
            encontrados.forEach { it.mostrarInfo() }
        }
    }
}

fun main() {

    val biblioteca = Biblioteca()

    biblioteca.registrarLibro(
        Libro(1, "1984", "George Orwell")
    )

    biblioteca.registrarLibro(
        Libro(2, "El Principito", "Antoine de Saint-Exupéry")
    )

    biblioteca.registrarLibro(
        Libro(3, "Clean Code", "Robert Martin")
    )

    biblioteca.listarLibrosDisponibles()

    println("\nPrestando libro ID 1")
    biblioteca.prestarLibro(1)

    println("\nIntentando prestar nuevamente el ID 1")
    biblioteca.prestarLibro(1)

    println("\nBuscar libro '1984'")
    biblioteca.buscarPorTitulo("1984")

    println("\nDevolver libro ID 1")
    biblioteca.devolverLibro(1)

    println("\nLibros disponibles:")
    biblioteca.listarLibrosDisponibles()
}