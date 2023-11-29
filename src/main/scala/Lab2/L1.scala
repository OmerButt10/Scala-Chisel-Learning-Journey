package  Lab2

import chisel3._ 
import chisel3.util._ 

class Mux2to1_IO extends Bundle{
    val in_A = Input(Bool())
    val in_B = Input(Bool())
    val select = Input(Bool())
    val out = Output(Bool())

}

class Mux2to1 extends Module{
    val io = IO(new Mux2to1_IO)

    io.out := io.in_A & io.select | io.in_B & (~ io.select )
}