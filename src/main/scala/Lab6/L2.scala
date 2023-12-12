package Lab6
import chisel3._
import chisel3.util._

class counter(val max:Int ,val min:UInt = 0.U) extends Module {
    val io = IO (new Bundle {

    val out = Output(UInt(log2Ceil(max).W))
})

    val counter = RegInit(0.U(log2Ceil(max).W))
// If the max count is of power 2 and the min value = 0 ,
// then we can skip the comparator and the Mux

    val count_buffer = Mux(isPow2(max).asBool && (min === 0.U) ,counter+1.U ,Mux(counter === max.asUInt ,min ,counter+1.U))

    // else Mux ( counter === max .U , min .U , counter + 1. U )
    counter := count_buffer
    io . out := counter
}

