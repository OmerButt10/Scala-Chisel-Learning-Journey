id: file://<WORKSPACE>/src/test/scala/Lab7/L1.scala:[86..93) in Input.VirtualFile("file://<WORKSPACE>/src/test/scala/Lab7/L1.scala", "package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 



class  extends App {
  Driver(() => new My_Queue) {
    c => new PeekPokeTester(c) {
      poke(c.io.in1.valid, true.B)
      poke(c.io.in1.bits, 42.U)
      poke(c.io.in2.valid, false.B)
      step(1)
    }
  }
}
")
file://<WORKSPACE>/src/test/scala/Lab7/L1.scala
file://<WORKSPACE>/src/test/scala/Lab7/L1.scala:9: error: expected identifier; obtained extends
class  extends App {
       ^
#### Short summary: 

expected identifier; obtained extends