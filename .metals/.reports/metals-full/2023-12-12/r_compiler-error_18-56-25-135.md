file://<WORKSPACE>/src/test/scala/Lab8/L1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 251
uri: file://<WORKSPACE>/src/test/scala/Lab8/L1.scala
text:
```scala
package Lab8

import org.scalatest._
import chiseltest._ 
import chisel3._ 

class Masked extends FreeSpec with ChiselScalatestTester{
    "MaskedRWSem" in {
        test(new  MaskedReadWriteSmem()){
            c=>
            
            c.io.mask(@@).enable.poke(1.B)
            c.io.mask.write.poke(1.B)
            c.io.mask.addr.poke(1.U)

            c.clock.step(100)
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