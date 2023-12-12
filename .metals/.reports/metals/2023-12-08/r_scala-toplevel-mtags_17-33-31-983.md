id: file://<WORKSPACE>/src/main/scala/Lab6/L3.scala:[61..64) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/Lab6/L3.scala", "package Lab6
import chisel3._
import chisel3.util._


class 
val timer_count = RegInit (0. U (8. W ) )

val done = timer_count === 0. U

val next = WireInit (0. U )

.when(reload){
    next := din
}
.elsewhen(!done){
    next := timer_count - 1. U
}
timer_count:= next")
file://<WORKSPACE>/src/main/scala/Lab6/L3.scala
file://<WORKSPACE>/src/main/scala/Lab6/L3.scala:7: error: expected identifier; obtained val
val timer_count = RegInit (0. U (8. W ) )
^
#### Short summary: 

expected identifier; obtained val