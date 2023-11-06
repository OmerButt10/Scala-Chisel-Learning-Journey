package  Lab1


import org.scalatest._
import chiseltest._ 
import chisel3._

class AWO extends FreeSpec with ChiselScalatestTester{
    "offset" in {
        test(new AdderwithOffset()){
             C =>
             C.clock.step(20)
        }
    }
}