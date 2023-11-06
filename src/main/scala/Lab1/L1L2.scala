package Lab1 
import chisel3._ 
import chisel3.util._ 


class AdderwithOffset extends Module {
    val io = IO(new Bundle{
    val x = Input(SInt(16.W))
    val y = Input(UInt(16.W))
    val z = Output(UInt(16.W))
    })
    val y1 = (23.U).asSInt
    val in1 = io.x + y1
    io.z := in1.asUInt + io.y
}