file://<WORKSPACE>/src/main/scala/Lab3/LA1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 719
uri: file://<WORKSPACE>/src/main/scala/Lab3/LA1.scala
text:
```scala
package lab3
import chisel3._
import chisel3.util._
import ALUOPR._

object ALUOPR {
    val ALU_BEQ = "b000". U (3. W )
    val ALU_BNE = "b001". U (3. W )
    val ALU_BLT = "b100". U (3. W )
    val ALU_BGE = "b101". U (3. W )
    val ALU_BLTU = "b110". U (3. W )
    val ALU_BGEU = "b111". U (3. W )
    val ALU_BLTE = "b010". U (3. W )
}

class LM_IO_Interface_BranchControl extends Bundle {
    val fnct3 = Input ( UInt (3. W ) )
    val branch = Input ( Bool () )
    val in_x = Input ( UInt (32. W ) )
    val in_y = Input ( UInt (32. W ) )
    val br_taken = Output ( Bool () )
}
class BranchControl extends Module {
        val io = IO ( new LM_IO_Interface_BranchControl )

    switch(io.branch){
        is()@@
        switch(io.branch){
        is(ALU_BEQ){
            io.br_taken:=io.in_x === io.in_y
        }
        is(ALU_BNE){
            io.br_taken:=io.in_x!= io.in_y
        }
        is(ALU_BLT){
            io.br_taken:=io.in_x < io.in_y
        }
        is(ALU_BGE){
            io.br_taken:=io.in_x >= io.in_y
        }
        is(ALU_BLTU){
            io.br_taken:=io.in_x <= io.in_y
        }
        is(ALU_BGEU){
             io.br_taken:=io.in_x >= io.in_y
        }
        is(ALU_BLTE){
            io.br_taken:=io.in_x <= io.in_y
        }
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