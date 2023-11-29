package Lab2
import chisel3._
import chisel3.util._

class LM_IO_Interface extends Bundle {
    val s0 = Input ( Bool () )
    val s1 = Input ( Bool () )
    val s2 = Input ( Bool () )
    val out = Output ( UInt(32.W) )
}


class Mux_5to1 extends Module {
val io = IO ( new LM_IO_Interface )

when(io.s2){
    io.out := 8.U
}.elsewhen(io.s1){
    io.out := 16.U
}.elsewhen(io.s1 && io.s2){
    io.out := 24.U
}.elsewhen(io.s0){
    io.out := 32.U

}.elsewhen(!io.s0 && !io.s1 && !io.s2 ){
    io.out := 0.U
}
.otherwise{
    io.out:= 0.U
}

}
