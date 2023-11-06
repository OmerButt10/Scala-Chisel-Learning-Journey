file://<WORKSPACE>/src/main/scala/Lab1/L1.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition count is defined in
  <WORKSPACE>/src/main/scala/Lab1/package.scala
and also in
  <WORKSPACE>/src/main/scala/Lab1/L1.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

action parameters:
offset: 340
uri: file://<WORKSPACE>/src/main/scala/Lab1/L1.scala
text:
```scala
package Lab1

import chisel3._
import chisel3.util._

class S_Counter ( counterBits : asSInt) extends Module{
    val io=IO(new Bundle {
    val result = Output( Bool())
    })

    val max = (1.asSInt << counterBits)
    val count = RegInit(0.asSInt(16.W))
    io.result := 0.B

when (count === max) {
    io.result := 1.B
    count := 0.S@@
}
.otherwise{
    count := count + 1.S
}
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition count is defined in
  <WORKSPACE>/src/main/scala/Lab1/package.scala
and also in
  <WORKSPACE>/src/main/scala/Lab1/L1.scala
One of these files should be removed from the classpath.