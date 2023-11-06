package Lab1 
import chisel3._ 
import chisel3.util._ 

class R_Counter (counterBits : UInt)  extends Module {
    val io= IO(new Bundle{
    val result = Output(Bool())
    })
    val count=RegInit(1.S(4.W))
    dontTouch(count)
    io.result := 0.B

    when (count(3) === 1.U) {
        io.result := 1.B
        count := 0.S
    }
    .otherwise{
        count:= count + 1.S
    }
}