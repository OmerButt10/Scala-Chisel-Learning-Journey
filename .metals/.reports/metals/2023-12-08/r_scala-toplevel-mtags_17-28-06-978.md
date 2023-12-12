id: file://<WORKSPACE>/src/test/scala/Lab6/L3.scala:[85..92) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab6/L3.scala", "package Lab6

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class  extends FreeSpec with ChiselScalatestTester{
    "" in {
        test(new  counter(2,0.U)){
            c=>
            c.clock.step(100)
        }

    }
}")
file://<WORKSPACE>/src/test/scala/Lab6/L3.scala
file://<WORKSPACE>/src/test/scala/Lab6/L3.scala:8: error: expected identifier; obtained extends
class  extends FreeSpec with ChiselScalatestTester{
       ^
#### Short summary: 

expected identifier; obtained extends