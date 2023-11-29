package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Mux_5to1_test extends FreeSpec with ChiselScalatestTester{
    "5to1" in {
        test(new  Mux_5to1){
            c=>
            c.io.s0.poke(0.B)
            c.io.s1.poke(0.B)
            c.io.s2.poke(0.B)
            c.io.out.expect(0.U)
            c.clock.step(100)
        }

    }
}