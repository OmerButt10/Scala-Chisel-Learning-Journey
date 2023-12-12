package Lab8
import chisel3._
import chisel3.util._

class SimpleInstr extends Module {
  val io = IO(new Bundle {
    val writeEnable = Input(Bool())
    val writeData = Input(UInt(32.W))
    val readEnable = Input(Bool())
    val memDataOut = Output(UInt(32.W))
    val compareResult = Output(Bool())
  })

  val memSize = 1024
  val mem = Mem(memSize, UInt(32.W))

  val address = RegInit(0.U(log2Ceil(memSize).W))

    when(io.writeEnable) {
    mem.write(address, io.writeData)
  }

  val readData = mem.read(address)
  io.memDataOut := readData

  io.compareResult := io.readEnable && (io.writeData === io.memDataOut)

  when(io.writeEnable || io.readEnable) {
    address := address + 1.U
  }
}

