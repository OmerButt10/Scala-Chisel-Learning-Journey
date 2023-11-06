package Lab1

import org.scalatest._ 
import chiseltest._ 
import chisel3._ 

class R_Countertest extends FreeSpec with ChiselScalatestTester{
    "Rtype" in {
        test(new R_Counter(5. U)){
            C =>
            C.clock.step(100)
        }
    }
}