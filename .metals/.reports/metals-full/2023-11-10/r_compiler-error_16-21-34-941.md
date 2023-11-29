file://<WORKSPACE>/src/test/scala/Lab2/L1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 343
uri: file://<WORKSPACE>/src/test/scala/Lab2/L1.scala
text:
```scala
package Lab2

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class M2to1_test extends FreeSpec with ChiselScalatestTester{
    "2to1type" in {
        test(new Mux2to1()){
            C =>
            C.io.in_A(1.B)
            C.io.in_B(0.B)
            C.io.select(0.B)
            C.out.expect(0.B)
            C.clock.step(@@)
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