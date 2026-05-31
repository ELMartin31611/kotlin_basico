class libro (
    val titulo: String,
    val autor: String,
    val publicacion: Int,
    val paginas: Int
) {

    fun mostrarInfo(){

        println("Titulo: $titulo")
        println("Autor: $autor")
        println("Año de publicacion: $publicacion")
        println("Numero de paginas: $paginas")


    }


    fun verificar(){

        if( publicacion < 2000 ){
            println("El libro es antiguo")
        } else {
            println("El libro es reciente")
        }
    }
}


fun main () {

    val libro1 = libro(
        "Don Quijote",
        "Miguel de Cervantes",
        1605,
        863
    )


    val libro2 = libro(
        "Five Nights at Freddy's: The Silver Eyes",
        "Scott Cawthon",
        2015,
        330

    )

    libro1.mostrarInfo()
    libro1.verificar()

    println()

    libro2.mostrarInfo()
    libro2.verificar()

}