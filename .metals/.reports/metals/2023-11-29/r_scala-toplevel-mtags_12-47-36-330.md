id: file://<WORKSPACE>/src/test/scala/Lab2/LA2.scala:[84..91) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab2/LA2.scala", "package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class  extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new  BST_test){
            c=>
            c.io.s0.poke(0.B)
            c.io.s1.poke(0.B)
            c.io.s2.poke(0.B)
            c.io.out.expect(0.U)
            c.clock.step(100)
        }

    }
}")
file://<WORKSPACE>/src/test/scala/Lab2/LA2.scala
file://<WORKSPACE>/src/test/scala/Lab2/LA2.scala:7: error: expected identifier; obtained extends
class  extends FreeSpec with ChiselScalatestTester{
       ^
#### Short summary: 

expected identifier; obtained extends