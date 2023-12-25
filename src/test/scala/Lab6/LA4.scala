package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._

class UDC_Tester  extends FreeSpec with ChiselScalatestTester{
    "UpdownCounter" in{
        test(new  UpDownCounter(6)){
            c=>    
            c.io.up_down.poke(1.B)
            c.clock.step(100)
       
    }
}
}