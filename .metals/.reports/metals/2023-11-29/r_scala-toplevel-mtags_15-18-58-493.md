id: file://<WORKSPACE>/src/test/scala/Lab3/L1.scala:[83..84) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab3/L1.scala", "package Lab3

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class 4 extends FreeSpec with ChiselScalatestTester{
    "--" in {
        test(new  --){
            c=>
            c.io.in(0).poke(0.U)
            c.io.in(1).poke(1.U)
            c.io.in(2).poke(0.U)
            c.io.in(3).poke(1.U)
            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            // c.io.out.expect(0.U)
            c.clock.step(100)
        }

    }
}")
file://<WORKSPACE>/src/test/scala/Lab3/L1.scala
file://<WORKSPACE>/src/test/scala/Lab3/L1.scala:7: error: expected identifier; obtained intlit
class 4 extends FreeSpec with ChiselScalatestTester{
      ^
#### Short summary: 

expected identifier; obtained intlit