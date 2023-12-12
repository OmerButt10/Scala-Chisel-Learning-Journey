id: file://<WORKSPACE>/src/test/scala/Lab6/L2.scala:[84..91) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab6/L2.scala", "package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class  extends FreeSpec with ChiselScalatestTester{
    "TypeCasted_Mux" in {
        test(new  Muxtce(UInt(32.W),SInt(32.W))){
            c=>
            
            c.io.in_1.poke(16.U)
            c.io.in_2.poke(8.S)
            c.io.sel.poke(1.B)
            c.clock.step(100)
        }

    }
}")
file://<WORKSPACE>/src/test/scala/Lab6/L2.scala
file://<WORKSPACE>/src/test/scala/Lab6/L2.scala:7: error: expected identifier; obtained extends
class  extends FreeSpec with ChiselScalatestTester{
       ^
#### Short summary: 

expected identifier; obtained extends