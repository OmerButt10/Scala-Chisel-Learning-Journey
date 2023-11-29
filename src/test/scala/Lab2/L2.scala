package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class IO_Interfacetest extends FreeSpec with ChiselScalatestTester{
    "LMIO" in {
        test(new Mux8to1()){
            c =>
            c.io.in0.poke(0.B)
            c.io.in1.poke(0.B)
            c.io.in2.poke(1.B)
            c.io.in3.poke(1.B)
            c.io.in4.poke(1.B)
            c.io.in5.poke(1.B)
            c.io.in6.poke(0.B)
            c.io.in7.poke(0.B)
            c.io.sel.poke(0.B)
            c.io.s1.poke(1.B)
            c.io.s2.poke(1.B)
            c.io.s3.poke(0.B)
            c.io.out.expect(0.B)
            c.clock.step(100)
        }

    }
}