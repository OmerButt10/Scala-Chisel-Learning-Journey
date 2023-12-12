package Lab7
import chisel3._
import chisel3.util._
//import chisel3.iotesters.PeekPokeTester


class My_Queue extends Module {
  val io = IO(new Bundle {
    val in0 = Flipped(Decoupled(UInt(8.W)))
    val in1 = Flipped(Decoupled(UInt(8.W)))

    val out = Decoupled(UInt(8.W))
  })

  val queue1 = Queue(io.in1, 5)
  val queue2 = Queue(io.in0, 5)

  val arbiter = Module(new Arbiter(UInt(8.W), 2))

  arbiter.io.in(0) <> queue1
  arbiter.io.in(1) <> queue2

  io.out <> arbiter.io.out

  
}