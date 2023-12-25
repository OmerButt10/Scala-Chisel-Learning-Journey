package Lab6

import chisel3._
import chisel3.util._

class counter_with_xor ( val max : Int = 1) extends Module {
val io = IO ( new Bundle {
val out = Output ( UInt ((log2Ceil(max).W)))
})
    val register = RegInit(0.U(log2Ceil(max).W))
    val msb = register(log2Ceil(max)-1)
    val xor = register ^ 1.U

    register := Mux(msb, 0.U,xor )

  io.out := register
}


