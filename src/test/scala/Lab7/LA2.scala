package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Manchester_Encoding_Tester extends FreeSpec with ChiselScalatestTester {
 "Manchester Encoder" in {
    test(new Manchester_Encoding()){
      c=>  
      c.io.in.poke(8.U)
      c.io.start.poke(1.B)
      c.clock.step(10)
    }
}
}