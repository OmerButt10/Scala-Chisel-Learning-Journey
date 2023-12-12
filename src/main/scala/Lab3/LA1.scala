package Lab3
import chisel3._
import chisel3.util._
import ALUOPR._

object ALUOPR {
    val ALU_BEQ = "b000". U (3. W )
    val ALU_BNE = "b001". U (3. W )
    val ALU_BLT = "b100". U (3. W )
    val ALU_BGE = "b101". U (3. W )
    val ALU_BLTU = "b110". U (3. W )
    val ALU_BGEU = "b111". U (3. W )
    val ALU_BLTE = "b010". U (3. W )
}
class LM_IO_Interface_BranchControl extends Bundle {
    val fnct3 = Input ( UInt (3. W ) )
    val branch = Input ( Bool () )
    val in_x = Input ( UInt (32. W ) )
    val in_y = Input ( UInt (32. W ) )
    val br_taken = Output ( Bool () )
    
}

    
    
class BranchControl extends Module {
  val io = IO(new LM_IO_Interface_BranchControl)

  io.br_taken := false.B

  when(io.branch) {
    switch(io.fnct3) {
      is(ALU_BEQ) {
        io.br_taken := io.in_x === io.in_y
      }
      is(ALU_BNE) {
        io.br_taken := io.in_x =/= io.in_y
      }
      is(ALU_BLT) {
        io.br_taken := io.in_x < io.in_y
      }
      is(ALU_BGE) {
        io.br_taken := io.in_x >= io.in_y
      }
      is(ALU_BLTU) {
        io.br_taken := io.in_x <= io.in_y
      }
      is(ALU_BGEU) {
        io.br_taken := io.in_x > io.in_y
      }
      is(ALU_BLTE) {
        io.br_taken := io.in_x <= io.in_y // Check if this is the intended behavior
      }
      // Add a default case for unexpected values of io.fnct3
  //}.otherwise {
    //io.br_taken := false.B
  //}
}
}
}