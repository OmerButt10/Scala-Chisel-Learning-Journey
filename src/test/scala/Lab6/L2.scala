package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class counter_modification extends FreeSpec with ChiselScalatestTester{
    "Counter Modification" in {
        test(new  counter(2,0.U)){
            c=>
            c.clock.step(100)
        }

    }
}