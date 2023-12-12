package Lab5

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Adder_Para extends FreeSpec with ChiselScalatestTester{
    "Add_IO_Para" in {
        test(new Adder(5)){
            c=>
            c.io.in0.poke(1.U)
            c.io.in1.poke(31.U)
            c.io.sum.expect(32.U)
            c.clock.step(10)
        }
    }    
}