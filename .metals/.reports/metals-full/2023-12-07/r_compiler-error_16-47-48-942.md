file://<WORKSPACE>/src/main/scala/Lab6/L1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 493
uri: file://<WORKSPACE>/src/main/scala/Lab6/L1.scala
text:
```scala
package Lab

import chisel3._
import chisel3.util._



class shift_register (numRegs: Int, val init : Int = 1) extends Module {
    val io = IO ( new Bundle {
        val dataIn   = Input(Vec(numRegs, UInt(dataWidth.W)))    
        val in = Input ( Bool () )
        val out = Output ( UInt (init. W ) )
})
    // register initialization
    val state = RegInit ( init . U (4. W ) )

    when(io.load) {
    // Load data into all registers in parallel
    registers := io.dataIn
  }

    for(@@)


    io.dataOut := registers(numRegs - 1)
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