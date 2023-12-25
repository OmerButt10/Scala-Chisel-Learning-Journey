package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class XOR_Tester extends FreeSpec with ChiselScalatestTester{
    "MSB_Shifter_Xor" in{
        test(new  counter_with_xor(32)){
            c=>    
            c.clock.step(100)
        }

    }
}