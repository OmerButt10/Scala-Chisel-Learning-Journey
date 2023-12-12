package Lab3
import chisel3._
import chisel3.util._
    
class LM_IO_Interface_ImmdValGen extends Bundle {
    val instr = Input ( UInt (32. W ) )
    val immd_se = Output ( UInt (32. W ) )
    val filledArray=Input(UInt(32.W))
}

class ImmdValGen extends Module {
    val io = IO ( new LM_IO_Interface_ImmdValGen )

    when(
  (io.instr(6,0) === "b0011011".U) ||
  (io.instr(6,0) === "b0000011".U) ||
  (io.instr(6,0) === "b0001111".U) ||
  (io.instr(6,0) === "b0011011".U) ||
  (io.instr(6,0) === "b1100111".U) ||
  (io.instr(6,0) === "b1110011".U)
) {
  io.immd_se:=0.U | io.instr(31,20)
}.elsewhen(
  (io.instr(6,0) === "b0010111".U) ||
  (io.instr(6,0) === "b0110111".U) ||
  (io.instr(6,0) === "b1101111".U)

) {
  io.immd_se:=0.U | io.instr(31,12)

}.elsewhen(
  (io.instr(6,0) === "b0100011".U) ||
  (io.instr(6,0) === "b1100011".U)

) {
  io.immd_se:=0.U | io.instr(31,22)

}.otherwise{
    io.immd_se:=0.U
}
}