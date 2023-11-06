package Lab1

import org.scalatest._
import chiseltest._
import chisel3._

class countertest extends FreeSpec with ChiselScalatestTester{
    "prac" in {
        test(new Counter(3.U)){
            C =>
            // C.io.in.poke(27.U)
            C.clock.step(10)
        }
    }
}