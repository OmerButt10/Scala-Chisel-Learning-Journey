package Lab2
import chisel3._
import chisel3.util._

class barrel_shift extends Module {
    val io = IO ( new Bundle {
    val in = Vec (4 , Input ( Bool () ) )
    val sel = Vec (2 , Input ( Bool () ) )
    val shift_type = Input ( Bool () )
    val out = Vec (4 , Output ( Bool () ) )
})

    io.out(0) := Mux1H(io.sel, Seq(io.in(0), io.in(1), io.in(2), io.in(3)))

    io.out(1) := Mux1H(io.sel, Seq(io.in(1), io.in(2), io.in(3),Mux(io.shift_type,io.in(0), 0.U  )))

    io.out(2) := Mux1H(io.sel, Seq(io.in(2), io.in(3),Mux(io.shift_type,io.in(0), 0.U), Mux(io.shift_type,io.in(1), 0.U) ))

    io.out(3) := Mux1H(io.sel, Seq(io.in(3), Mux(io.shift_type,io.in(0), 0.U), Mux(io.shift_type,io.in(1), 0.U),Mux(io.shift_type,io.in(2),0.U) ))
}