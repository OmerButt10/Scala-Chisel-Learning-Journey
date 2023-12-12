package Lab6

import chisel3._
import chisel3.util._



class shift_register (numRegs: Int, val init : Int = 1) extends Module {
    val io = IO ( new Bundle {
        val dataIn = Input(Vec(numRegs, UInt(init.W)))
        val load = Input ( Bool () )    
        val in = Input ( Bool () )
        val out = Output ( UInt (init. W ) )
})
    //val register = RegInit(Vec(numRegs,Seq.fill(12)(UInt(4.W))))
    val register = RegInit(VecInit(Seq.fill(numRegs)(0.U(12.W))))

    when(io.load) {
    register := io.dataIn
  }

    for(i <- 0 until numRegs -1 ){
        register(i) := register(i + 1)
    }


    io.out := register(numRegs - 1)
}