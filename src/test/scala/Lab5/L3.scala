package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class oper extends FreeSpec with ChiselScalatestTester{
    "logic_opertors" in {
        test(new Operator(4,UInt(32.W))(_ + _)){
            c=>
            c.io.in(0).poke(1.U)
            c.io.in(1).poke(0.U)
            c.io.in(2).poke(0.U)
            c.io.in(3).poke(1.U)
            c.clock.step(10)
        }
    }    
}