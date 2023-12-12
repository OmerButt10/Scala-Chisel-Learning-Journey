package Lab5
import chisel3._
import chisel3.util._


// your code for Transaction_in class

class T_In[T <: Data](gen: T) extends Bundle {
       val add_f = UInt(10.W)
       val dat_f = gen.cloneType
       }

// your code for Transaction_out class

class T_Out[T <: Data](gen: T) extends Bundle {    
       val add_f = UInt(10.W)
       val dat_f = gen.cloneType
       }

//Router Class Where all the action goes Down

class Router [ T <: Data ]( gen : T ) extends Module {
    val io=IO(new Bundle{
        val In = Input(new T_In(gen))
        val Out = Output(new T_Out(gen))

})
    io.Out:=io.In
}
