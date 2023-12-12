package Lab5

import chisel3._
import chisel3.util._

class Muxtce [ T <: Data ]( genT : T , genU : T ) extends Module {
    val io = IO ( new Bundle {
        val in_1 = Input(genT)
        val in_2 = Input(genU)
        val sel = Input(Bool())
        val out = Output(genT.cloneType)
})
    io . out := Mux (io.sel,io.in_1.asTypeOf(genT) ,io.in_2.asTypeOf(genT))
 
}