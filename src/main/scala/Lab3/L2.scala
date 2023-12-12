package Lab3
import chisel3._
import chisel3.util._
import ALUOP._

object ALUOP {
    val ALU_ADD = 0. U (4. W )
    val ALU_SUB = 1. U (4. W )
    val ALU_AND = 2. U (4. W )
    val ALU_OR = 3. U (4. W )
    val ALU_XOR = 4. U (4. W )
    val ALU_SLT = 5. U (4. W )
    val ALU_SLL = 6. U (4. W )
    val ALU_SLTU = 7. U (4. W )
    val ALU_SRL = 8. U (4. W )
    val ALU_SRA = 9. U (4. W )
    val ALU_COPY_A = 10. U (4. W )
    val ALU_COPY_B = 11. U (4. W )
    val ALU_XXX = 15. U (4. W )
}

trait Config { val WLEN = 32
val ALUOP_SIG_LEN = 4
}
//import ALUOP._
class ALUIO extends Bundle with Config {
    val in_A = Input ( UInt ( WLEN . W ) )
    val in_B = Input ( UInt ( WLEN . W ) )
    val alu_Op = Input ( UInt ( ALUOP_SIG_LEN . W ) )
    val out = Output ( UInt ( WLEN . W ) )
}

class ALU extends Module with Config {
val io = IO ( new ALUIO() )
io.out:= 0.U
switch (io.alu_Op) {
    is(ALU_ADD){
        io.out:=io.in_A+io.in_B
    }
    is(ALU_SUB){
        io.out:=io.in_A-io.in_B
    }
    is(ALU_AND){
        io.out:=io.in_A & io.in_B
    }
    is(ALU_OR){
        io.out:=io.in_A | io.in_B
    }
    is(ALU_XOR){
        io.out:=io.in_A ^ io.in_B
    }
    is(ALU_SLL) {
      io.out := io.in_A(5,0) << io.in_B(5,0)
    }

    is(ALU_SLT) {
      io.out := io.in_A(5,0) < io.in_B(5,0)
    }
    is(ALU_SLTU) {
      io.out := 0.U
    }
    is(ALU_SRL) {
      io.out := io.in_A(5,0) >> io.in_B(5,0)
    }

    is(ALU_SRA) {
        io.out := io.in_A(5,0) >> io.in_B(5,0)
    }
    is(ALU_COPY_A){
        io.out:= io.in_A 
    }
    is(ALU_COPY_B){
        io.out:= io.in_B
    }
       // Add a default case for unexpected ALU operations
    is(ALU_XXX) { 
        io.out := 0.U
    }
}
}

