package Lab3

import org.scalatest._
import chiseltest._ 
import chisel3._ 
import ALUOP._

class ALU_OP_test extends FreeSpec with ChiselScalatestTester {
  "ALUOPR" in {
    test(new ALU) { c =>
      c.io.in_A.poke(1.U)
      c.io.in_B.poke(1.U)
      c.io.alu_Op.poke(ALU_AND)

      c.clock.step(100)
    }
  }
}
