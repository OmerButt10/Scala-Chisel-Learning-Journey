package Lab1

import chisel3._
import chisel3.util._

class S_Counter ( counterBits : UInt) extends Module{
    val io=IO(new Bundle {
    val result = Output( Bool())
    })

    val max = (1.asSInt << counterBits)
    val count = RegInit(0.asSInt(16.W))
    io.result := 0.B

when (count === max) {
    io.result := 1.B
    count := 0.S
}
.otherwise{
    count := count + 1.S
}
}