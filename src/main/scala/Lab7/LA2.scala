package Lab7

import chisel3._
import chisel3.util._
import chisel3.experimental.ChiselEnum

object Manchester_Encoding {
  object State extends ChiselEnum {
    val IDLE, s1, s2 = Value
  }
}

class Manchester_Encoding extends Module {
  import Manchester_Encoding._

  val io = IO(new Bundle {
    val in = Input(UInt(1.W))
    val start = Input(Bool())
    val out = Output(UInt(8.W))
    val flag = Output(UInt(1.W))
  })

  val state = RegInit(State.IDLE)
  val out = Reg(UInt(8.W))

  
  switch(state) {
    is(State.IDLE) {
      when(io.start) {
        state := State.s1
      }
    }
    is(State.s1) {
      when(io.start) {
        state := State.s2
        out := (out << 1) | io.in
      }
    }
    is(State.s2) {
      when(!io.start) {
        state := State.IDLE
        out := (out << 1) | io.in
      }
    }
  }

  // Output logic
  io.out := out
  io.flag := state === State.IDLE
}
