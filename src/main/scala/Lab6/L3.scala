package Lab6
import chisel3._
import chisel3.util._

class TwoShot(val max: UInt) extends Module {
  val io = IO(new Bundle {
    val reset = Output(Bool())
  })

   var timer = RegInit(6.U(32.W))
   var count = RegInit(0.U(8.W))
   dontTouch(count)

//   // Default assignment for io.reset
//   io.reset := false.B

//   when(count === 1.U) {
//       count := 2.U
//       io.reset := 1.B
//     }
//   .elsewhen(count === 2.U){
//     count := 0.U
//   }



//   when(timer =/= 0.U) {
//       // Set io.reset when count is 2
//       }
//   .otherwise {
//     io.reset := 1.B
//     timer := max
//     count := count + 1.U
//   }
// //   when(count === 1.U) {
// //       count := 2.U
// //       io.reset := 1.B
// //     }
// //   }
// }


io.reset:=false.B

when(count === 1.U){
  count := count + 1.U
  io.reset := true.B
}
.otherwise{
  io.reset := 0.U
  timer :=  timer - 1.U

  when(timer === 0.U){
    timer := 6.U
    count := 2.U
    io.reset := true.B
  }
}
}