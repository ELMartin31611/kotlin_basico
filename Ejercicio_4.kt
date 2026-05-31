interface MetodoPago {
    fun procesarPago(monto: Double)
}

class PagoEfectivo : MetodoPago {

    override fun procesarPago(monto: Double) {
        println("Pago en efectivo realizado por $$monto")
    }
}

class PagoTarjeta : MetodoPago {

    override fun procesarPago(monto: Double) {
        println("Pago con tarjeta aprobado por $$monto")
    }
}

class PagoTransferencia : MetodoPago {

    override fun procesarPago(monto: Double) {
        println("Transferencia bancaria realizada por $$monto")
    }
}

fun main() {

    val metodosPago: List<MetodoPago> = listOf(
        PagoEfectivo(),
        PagoTarjeta(),
        PagoTransferencia()
    )

    for (metodo in metodosPago) {
        metodo.procesarPago(100.0)
    }
}