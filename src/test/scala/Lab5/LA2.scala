package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Router_Test extends FreeSpec with ChiselScalatestTester{
    "Tin_Tout_R" in {
        test(new Router(UInt(32.W))){
            c=>
            c.io.In.add_f.poke(1.U)
            c.io.In.dat_f.poke(1.U)
            c.clock.step(10)
        }
    }    
}