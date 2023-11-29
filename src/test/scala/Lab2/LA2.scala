package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class BST_test extends FreeSpec with ChiselScalatestTester{
    "barrelshifter" in {
        test(new  barrel_shift){
            c=>
            c.io.sel(0).poke(0.B)
            c.io.sel(1).poke(1.B)
            c.io.in(0).poke(0.B)
            c.io.in(1).poke(1.B)
            c.io.in(2).poke(0.B)
            c.io.in(3).poke(1.B)
            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            c.clock.step(100)
        }

    }
}