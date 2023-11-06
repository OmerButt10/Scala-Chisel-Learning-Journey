file://<WORKSPACE>/src/main/scala/package.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 409
uri: file://<WORKSPACE>/src/main/scala/package.scala
text:
```scala
import Lab1
import chisel3._ 

class M_Counter(size:Int ,maxValue:Uint) extends Module{
    val io=IO(new Bundle{
        val result=Output(Bool())
    })

    def genCounter(n:Int,max:Uint)={
        val count = RegInit(0.U(n.W))

        when(count === max){
            count :=  0.U

        }.otherwise{
            count := count + 1.U
     
        }
        count 
    }
    val counter1 = genCounter(@@)

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