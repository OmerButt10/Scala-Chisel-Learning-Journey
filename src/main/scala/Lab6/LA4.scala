package Lab6

import chisel3._
import chisel3.util._

class UpDownCounter(val max: Int = 10) extends Module {
  val io = IO(new Bundle {
    val out = Output(UInt(log2Ceil(max).W))
    val up_down = Input(Bool())
  })

  val count = RegInit(0.U(log2Ceil(max).W))

  when(io.up_down) {
      count := 0.U
    }.otherwise {
      count := count + 1.U
    }

  when(io.up_down && count < (max - 1).U) {
    // Increment logic
    count := count + 1.U
  }.elsewhen(!io.up_down && count > 0.U) {
    // Decrement logic
    count := (max - 1).U
  }

  io.out := count
}
