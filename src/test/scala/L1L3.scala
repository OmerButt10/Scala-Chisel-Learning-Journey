package Lab1

import org.scalatest._ 
import chiseltest._ 
import chisel3._ 

class M_Countertest extends FreeSpec with ChiselScalatestTester{
    "Mtype" in {
        test(new M_Counter(5,5.U)){
            C =>
            C.clock.step(100)
        }
    }
}