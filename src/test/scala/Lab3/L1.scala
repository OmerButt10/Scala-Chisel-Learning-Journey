package Lab3

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Decoder4to2_test extends FreeSpec with ChiselScalatestTester{
    "4to2" in {
        test(new  Decoder4to2){
            c=>
            c.io.in.poke(0.U)

            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            c.clock.step(100)
        }

    }
}