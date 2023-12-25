package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Two_Shot_Timer extends FreeSpec with ChiselScalatestTester{
    "One Two Shot Timer" in{
        test(new  TwoShotTimer()){
            c=>
            c.io.reload.poke(1.B)    
            c.clock.step(100)
        }

    }
}