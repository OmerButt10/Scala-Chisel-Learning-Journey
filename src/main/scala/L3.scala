package  Lab1

import chisel3._ 
import chisel3.util._ 

class maxcounter(size: Int , maxValue:Int) extends Module{
    val io=IO(new Bundle{
        val result=Output(Bool())
        
    })
    val x = size
    def genCounter(n : Int,max : Int)={
        val count = RegInit(0.U(n.W))

        when(count === max.asUInt){
            count :=  0.asUInt

        }.otherwise{
            count := count + 1.U
     
        }
        count 
        

    }
    val counter1 = genCounter(x,maxValue)
    io.result  := counter1(x.asUInt-1.U)

}