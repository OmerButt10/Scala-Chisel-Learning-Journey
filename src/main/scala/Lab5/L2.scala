package Lab5
import chisel3._
import chisel3.util._

class eMux [ T <: Data ](data_type:T) extends Module {
    val io = IO ( new Bundle {
    val out = Output (data_type.cloneType)
    val in1 = Input (data_type.cloneType)
    val in2 = Input (data_type.cloneType)
    val sel = Input ( Bool () )
})
    io . out := Mux2_to_1 ( io . in2 , io . in1 , io . sel )

    def Mux2_to_1 [ T <: Data ]( in_0 :T , in_1 :T , sel : Bool ) : T = {
        Mux ( sel , in_1 , in_0 )
}
}