id: file://<WORKSPACE>/src/test/scala/Lab3/L1.scala:[84..91) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab3/L1.scala", "package Lab3

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class  extends FreeSpec with ChiselScalatestTester{
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
}")
file://<WORKSPACE>/src/test/scala/Lab3/L1.scala
file://<WORKSPACE>/src/test/scala/Lab3/L1.scala:7: error: expected identifier; obtained extends
class  extends FreeSpec with ChiselScalatestTester{
       ^
#### Short summary: 

expected identifier; obtained extends