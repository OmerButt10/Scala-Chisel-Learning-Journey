file://<WORKSPACE>/src/test/scala/Lab7/LA2.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 303
uri: file://<WORKSPACE>/src/test/scala/Lab7/LA2.scala
text:
```scala
package Lab7

import org.scalatest._
import chiseltest._ 
import chisel3._ 


class Manchester_Encoding_Tester extends FreeSpec with ChiselScalatestTester {
 "Manchester Encoder" in {
    test(new Manchester_Encoding()){
      c=>  
      c.io.in.poke(8.U)
      c.io.start.poke(1.B)
      c.clock.step(@@)
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
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:388)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 0