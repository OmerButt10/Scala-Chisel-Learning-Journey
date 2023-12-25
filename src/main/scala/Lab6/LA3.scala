package Lab6

import chisel3._
import chisel3.util._

class ShiftRegWithParallelLoad(val len: Int = 1) extends Module {
  val io = IO(new Bundle {
    val out = Vec(len, Output(Bool()))
    val load_in = Vec(len, Input(Bool()))
    val in = Input(Bool())
    val load = Input(Bool())
  })
  val shiftRegister = RegInit(VecInit(Seq.fill(len)(0.U(1.W))))

  // val shiftRegister = RegInit(VecInit(Seq.fill(len)(0.U(1.W))))

  when(io.load) {
    shiftRegister := io.load_in
  }
  .otherwise {
    shiftRegister(0) := Mux(io.load, io.in, shiftRegister(len - 1))
    for (i <- 1 until len) {
      shiftRegister(i) := shiftRegister(i - 1)
    }
  }

  io.out := shiftRegister

}