id: file://<WORKSPACE>/src/test/scala/Lab8/L1.scala:[84..91) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab8/L1.scala", "package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class  extends FreeSpec with ChiselScalatestTester{
    "EParaMux" in {
        test(new  eMux(UInt(32.W))){
            c=>
            
            c.io.in1.poke(16.U)
            c.io.in2.poke(8.U)
            c.io.sel.poke(1.B)
            c.clock.step(100)
        }

    }
}")
file://<WORKSPACE>/src/test/scala/Lab8/L1.scala
file://<WORKSPACE>/src/test/scala/Lab8/L1.scala:7: error: expected identifier; obtained extends
class  extends FreeSpec with ChiselScalatestTester{
       ^
#### Short summary: 

expected identifier; obtained extends