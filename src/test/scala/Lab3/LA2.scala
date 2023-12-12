package Lab3
import org.scalatest.FreeSpec
import chiseltest._ 
import chisel3._ 

class Imm_Tester extends FreeSpec with ChiselScalatestTester{
    "Immi" in {
        test(new ImmdValGen()){
            c=>
            c.io.instr.poke("b0011011".U)
            c.clock.step(100)
        }

    }
}
