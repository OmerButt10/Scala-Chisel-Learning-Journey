file://<WORKSPACE>/src/main/scala/Lab5/L1.scala
### java.lang.IndexOutOfBoundsException: 0

occurred in the presentation compiler.

action parameters:
offset: 1381
uri: file://<WORKSPACE>/src/main/scala/Lab5/L1.scala
text:
```scala
import chisel3._
import chisel3.util._
import chisel3.iotesters.{Driver,PeekPokeTester}

class ALU ( width_parameter : Int ) extends Module {
    val io = IO ( new IO_Interface ( width_parameter ) )
    io . alu_out := 0. U
    val index = log2Ceil ( width_parameter )

when ( io . alu_oper ) { 
    // AND
    else( " b0000 " . U ) {
        io . alu_out := io . arg_x & io . arg_y
        } 
    // OR
    .elsewhen( " b0001 " . U ) {
        io . alu_out := io . arg_x | io . arg_y
         }     // ADD
    .elsewhen( " b0010 " . U ) {
        io . alu_out := io . arg_x + io . arg_y
        } // SUB
    .elsewhen( " b0110 " . U ) {
        io . alu_out := io . arg_x - io . arg_y
        } // XOR
    .elsewhen( " b0011 " . U ) {
        io . alu_out := io . arg_x ^ io . arg_y
        } // SLL
    .elsewhen( " b0100 " . U ) {
        io . alu_out := io . arg_x << io . arg_y ( index -1 , 0)
        } // SRL
    .elsewhen( " b0101 " . U ) {
        io . alu_out := io . arg_x >> io . arg_y ( index -1 , 0)
        } // SRA
    .elsewhen( " b0111 " . U ) {
        io . alu_out := ( io . arg_x . asSInt >> io . arg_y ( index -1 , 0) ) . asUInt
        } // SLT
    .elsewhen( " b1000 " . U ) {
        io . alu_out := io . arg_x . asSInt < io . arg_y . asSInt
        } // SLTU
    .elsewhen( " b1001 " . U ) {
        io . alu_out := io . arg_x < io . arg_y
        }
    ,@@
}
}
class IO_Interface ( width : Int ) extends Bundle {

    val alu_oper = Input ( UInt ( width . W ) )
    val arg_x = Input ( UInt ( width . W ) )
    val arg_y = Input ( UInt ( width . W ) )
    val alu_out = Output ( UInt ( width . W ) )
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