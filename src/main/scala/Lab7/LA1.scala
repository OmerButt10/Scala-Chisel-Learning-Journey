package Lab7

import chisel3._
import chisel3.util._

// import chisel3.iotesters.{ChiselFlatSpec , Driver , PeekPokeTester}

// import chisel3.experimental.ChiselEnum

// Sequence to detect is 110
class My_FSM extends Module {
    val io = IO (new Bundle {
        val f1 = Input (Bool())
        val f2 = Input (Bool())

        val r1 = Input (Bool())
        val r2 = Input (Bool())
        val out =  Output(UInt(32.W))
       

    })

 
    
val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil = Enum (6)
val state = RegInit ( s0 )



// io.out := ( state === s5 ) & (! io.f2 )

io.out := DontCare
switch(state){
        is(s0){
            when ((!io.f1) & (!io.f2)) {
            state := s0
            io.out := 0.U
            }.elsewhen (io.f1 & (!io.f2)) {
                state := s0
                io.out := 0.U 
            }.elsewhen ((!io.f1) && io.f2){
                state := s5
                io.out := 0.U
            }.elsewhen (io.f1 & io.f2){
            state := s1
            io.out := 0.U
            }        
        }
        is(s1){
            when ((!io.f1) && (!io.r1)) {
                state := s2
                io.out := 0.U
            }.elsewhen (io.f1 ) {
                state := s2
                io.out := 0.U
            }.elsewhen ((!io.f1) && io.r1){
            state := s0
            io.out := 0.U
            }
        }
        is(s2){
            when ((!io.f1) && (!io.r1)){
                state := s2
                io.out:=3.U
            }.elsewhen (io.f1){
                state := s3
                io.out:=3.U
            }.elsewhen ((!io.f1) && (!io.r1)){
            state := s2
            io.out:=3.U
            }.elsewhen ((!io.f1) && io.r1){
                state := s1
                io.out:=3.U
            }
        }
        is(s3){
            when ((!io.f1) && (!io.r1) && (!io.f2) && (!io.r2)){
            state := s0
            io.out:=0.U
            }
        
    .elsewhen(io.f2 ){
            state := s3
            io.out:=7.U
            }
        

    .elsewhen (io.f2 && io.r2){
            state := s4
            io.out:=7.U
            }
        }
        
       is(s5){
            when (io.f2){
            state := s4
            io.out:=7.U
            }
        
        
            .elsewhen ((!io.f2) && (!io.r2)){
            state := s5
            io.out:=0.U
            }
        
        
            when (io.f2 && (!io.r2)){
            state := s0
            io.out:=0.U
            }
        }

       
        
        }
    
}
