package Lab3

import org.scalatest.FreeSpec
import chisel3._ 
import chiseltest._


class BC_Tester extends FreeSpec with ChiselScalatestTester{
    "BCT" in {
        test(new BranchControl){
            c=>
            c.io.in_x.poke(1.U)
            c.io.in_y.poke(0.U)
            c.io.branch.poke(1.B)
            c.io.fnct3.poke("b000".U)
            c.clock.step(10)

            //val expectedValue = true
            //assert(c.io.br_taken.peek().litToBoolean == expectedValue)

        }

    }
}