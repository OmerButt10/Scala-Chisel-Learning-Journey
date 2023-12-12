package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Test_TCMux extends FreeSpec with ChiselScalatestTester{
    "TypeCasted_Mux" in {
        test(new  Muxtce(UInt(32.W),SInt(32.W))){
            c=>
            
            c.io.in_1.poke(16.U)
            c.io.in_2.poke(8.S)
            c.io.sel.poke(1.B)
            c.clock.step(100)
        }

    }
}