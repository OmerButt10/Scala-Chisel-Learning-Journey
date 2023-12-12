package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class EPMux extends FreeSpec with ChiselScalatestTester{
    "EParaMux" in {
        test(new  eMux(UInt(32.W))){
            c=>
            
            c.io.in1.poke(16.U)
            c.io.in2.poke(8.U)
            c.io.sel.poke(1.B)
            c.clock.step(100)
        }

    }
}