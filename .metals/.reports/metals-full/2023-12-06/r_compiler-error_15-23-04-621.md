file://<WORKSPACE>/src/main/scala/L3.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 315
uri: file://<WORKSPACE>/src/main/scala/L3.scala
text:
```scala
package Lab5
import chisel3._
import chisel3.util._

class Operator [T<:Data](n:Int,generic:T) (op:(T,T)=>T) extends
Module {
    require ( n > 0) // " reduce only works on non - empty Vecs "
    val io = IO ( new Bundle {
        val in = Input (Vec(n,generic))
        val out = Output(Vec(n,generic))
})
    for(@@)
    io.out :=  op(io.in, io.in)
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