package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Count_tester extends FreeSpec with ChiselScalatestTester{
    "Log2Ciel Tester" in{
        test(new  P_counter(13)){
            c=>    
            c.clock.step(100)
        }

    }
}