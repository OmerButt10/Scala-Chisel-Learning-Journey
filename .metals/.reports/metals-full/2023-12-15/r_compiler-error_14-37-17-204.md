file://<WORKSPACE>/src/main/scala/Lab6/LA4.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 341
uri: file://<WORKSPACE>/src/main/scala/Lab6/LA4.scala
text:
```scala
package Lab6

import chisel3._
import chisel3.util._

class shift_reg_with_parallel_load (val len:Int=1) extends Module {
    val io = IO ( new Bundle {
        val out = Vec(len,Output(Bool()))
        val load_in = Vec(len , Input(Bool()))
        val in = Input(Bool())
        val load = Input(Bool())
})

    var counter = RegInit(0.U)(@@)

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