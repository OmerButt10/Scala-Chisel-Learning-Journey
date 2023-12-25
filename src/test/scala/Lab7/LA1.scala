package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class FSM_Tester extends FreeSpec with ChiselScalatestTester {
 "Finite State Machine" in {
    test(new My_FSM()){
      c=>  
      c.io.f1.poke(1.B)
      c.io.f2.poke(1.B)
      c.io.r1.poke(1.B)
      c.io.r2.poke(1.B)
    }
}
}