package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 



class My_QueueMain extends FreeSpec with ChiselScalatestTester {
 "Test Arbiter" in {
    test(new My_Queue()){
      c=>  
      c.io.in1.valid.poke( true.B)
      c.io.in1.bits.poke( 42.U)

      c.io.in0.valid.poke( true.B)
      c.io.in0.bits.poke( 42.U)
    c.clock.step(10)
    }
  }
}
