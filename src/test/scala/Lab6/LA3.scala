package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class SRPL extends FreeSpec with ChiselScalatestTester{
    "Shift-Register-Parallel-Loader" in{
        test(new ShiftRegWithParallelLoad(3)){
            c=>   
            c.io.in.poke(1.B) 
            c.io.load.poke(1.B)
            c.io.load_in(0).poke(1.B)
            c.io.load_in(1).poke(0.B)
            c.clock.step(100)
        }

    }
}