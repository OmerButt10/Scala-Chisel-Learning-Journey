package Lab8

import org.scalatest._
import chiseltest._
import chisel3._

class Masked extends FreeSpec with ChiselScalatestTester {
  "MaskedRWSmem" in {
    test(new MaskedReadWriteSmem()) { c =>
      c.io.enable.poke(true.B)
      c.io.write.poke(true.B)
      c.io.addr.poke(1.U)

      c.io.mask(0).poke(true.B)
      c.io.mask(1).poke(false.B)
      c.io.mask(2).poke(false.B)
      c.io.mask(3).poke(false.B)

      c.io.dataIn(0).poke(42.U)
      c.io.dataIn(1).poke(0.U)
      c.io.dataIn(2).poke(0.U)
      c.io.dataIn(3).poke(0.U)

      c.clock.step(10)
    }
  }
}
