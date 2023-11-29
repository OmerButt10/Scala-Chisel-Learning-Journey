package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Mux_1H extends FreeSpec with ChiselScalatestTester{
    "4to1" in {
        test(new  mux_onehot_4to1()){
            c=>
            c.io.in0.poke(3.U)
            c.io.in1.poke(1.U)
            c.io.in2.poke(2.U)
            c.io.in3.poke(4.U)
            c.io.sel.poke(3.U)
            c.io.out.expect(3.U)
            c.clock.step(100)
        }

    }
}
