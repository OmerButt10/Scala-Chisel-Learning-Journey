package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Para_Alu extends FreeSpec with ChiselScalatestTester{
    "else when Alu" in {
        test(new  ALU(12)){
            c=>
            c.io.alu_oper.poke(4.U)
            c.io.arg_x.poke(4.U)
            c.io.arg_y.poke(4.U)
            c.clock.step(100)
        }

    }
}