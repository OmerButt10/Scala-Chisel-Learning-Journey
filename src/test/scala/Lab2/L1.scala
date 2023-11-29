package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class M2to1_test extends FreeSpec with ChiselScalatestTester{
    "2to1type" in {
        test(new Mux2to1()){
            c =>
            c.io.in_A.poke(0.B)
            c.io.in_B.poke(1.B)
            c.io.select.poke(0.B)
            c.io.out.expect(1.B)
            c.clock.step(100)
        }

    }
}