file://<WORKSPACE>/src/test/scala/Lab7/L1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 263
uri: file://<WORKSPACE>/src/test/scala/Lab7/L1.scala
text:
```scala
package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 



class My_QueueMain extends FreeSpec with ChiselScalatestTester {
 "Test Arbiter" in {
    test(new My_Queue()){
      c=>  
      c.io.in1.valid.poke( true.B)
      c.io.in1.bits.poke(@@) 42.U)
      c.io.in1.ready, true.B
      c.io.in0.ready, 42.U)     
      c.io.in0.valid, false.)
      c.clock.step(10)
    }
  }
}

```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:131)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.countParams(Signatures.scala:501)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:186)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:94)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:63)
	scala.meta.internal.pc.MetalsSignatures$.signatures(MetalsSignatures.scala:17)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:51)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:375)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0