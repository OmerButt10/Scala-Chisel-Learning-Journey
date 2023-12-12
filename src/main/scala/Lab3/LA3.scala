  package Lab3
  import chisel3._
  import chisel3.util._

  class LM_IO_Interface_decoder_with_valid extends Bundle {
    val in = Input(UInt(2.W))
    val out = Valid(Output(UInt(4.W)))
  }

  class decoder_with_valid extends Module {
    val io = IO(new LM_IO_Interface_decoder_with_valid())

    //io.out.valid := false.B
    //io.out.bits:=0.U

    val decodedOutput = Wire(Vec(4,Bool()))
    decodedOutput(0) := (io.in === 0.U)
    decodedOutput(1) := (io.in === 1.U)
    decodedOutput(2) := (io.in === 2.U)
    decodedOutput(3) := io.in === 3.U


    io.out.valid := true.B
    io.out.bits := Cat(decodedOutput.reverse)
  }


