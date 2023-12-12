package Lab8

import org.scalatest._
import chiseltest._
import chisel3._

class SimpleInstr_Test extends FreeSpec with ChiselScalatestTester {
  "Eval_Instr" in {
    test(new SimpleInstr()) {
      c =>
      c.io.writeEnable.poke(true.B)  
      c.io.readEnable.poke(true.B)
      c.io.writeData.poke(8.U)
      

      c.clock.step(10)
    }
  }
}
