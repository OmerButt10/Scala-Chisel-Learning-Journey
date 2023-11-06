package Lab1

import org.scalatest._ 
import chiseltest._ 
import chisel3._ 

class S_countertest extends FreeSpec with ChiselScalatestTester{
    "stype" in {
        test(new S_Counter(3. U)){
            C =>
            C.clock.step(10)
        }
    }
}