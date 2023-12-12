package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Two_Shot_Timer extends FreeSpec with ChiselScalatestTester{
    "One Two Shot Timer" in{
        test(new  TwoShot(6.U)){
            c=>
            c.clock.step(100)
        }

    }
}