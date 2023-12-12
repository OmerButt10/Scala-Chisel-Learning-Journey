package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Parallel_Shifter extends FreeSpec with ChiselScalatestTester{
    "Parallel_Shifter" in {
        test(new  shift_register(32,32)){
            c=>            
            c.io.dataIn(0).poke(16.U)
            c.io.dataIn(1).poke(8.U)
            c.io.dataIn(2).poke(32.U)
            c.io.dataIn(3).poke(24.U)
            c.io.load.poke(true.B)
            c.io.in.poke(true.B)
            c.clock.step(100)
        }

    }
}