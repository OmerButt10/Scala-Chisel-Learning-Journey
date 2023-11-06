package Lab1

import org.scalatest._ 
import chiseltest._ 
import chisel3._ 

class Max_Countertest extends FreeSpec with ChiselScalatestTester{
    "Maxtype" in {
        test(new M_Counter(5,5.U)){
            C =>
            C.clock.step(100)
        }
    }
}