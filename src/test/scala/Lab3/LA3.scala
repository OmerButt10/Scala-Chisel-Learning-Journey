package Lab3
import chisel3._
import chiseltest._
import org.scalatest._

class DecoderWithValidTester extends FreeSpec with ChiselScalatestTester {
  "Decoder with VT" in {
    test(new decoder_with_valid()) { 
      c =>
            
      // Set input to 0
      c.io.in.poke(0.U)
      // Clock time
      c.clock.step()

      // Set input to 1
      c.io.in.poke(1.U)
      // Clock time
      c.clock.step()

      // Set input to 2
      c.io.in.poke(2.U)
      // Clock time
      c.clock.step()
      
      // Set input to 3
      c.io.in.poke(3.U)
      // Clock time
      c.clock.step()


     }
  }
}
