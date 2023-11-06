package Lab1

import chisel3._
import chisel3.util._

class Counter ( counterBits : UInt ) extends Module {
    val io = IO ( new Bundle {
    val result = Output ( Bool () )
    })

    val max = (1.U << counterBits ) 
    val count = RegInit (0.U (16. W ) )
    io.result := 0.B
    
    when ( count === max ) {
        io.result := 1.B
        count := 0.U
    } 
    
    .otherwise {
        count := count + 1. U
    }
    
}