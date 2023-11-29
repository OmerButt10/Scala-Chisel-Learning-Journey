package Lab2

import chisel3 . _
import chisel3 . util . _

class MuxLookup extends Bundle {
    val in0 = Input ( Bool () )
    val in1 = Input ( Bool () )
    val in2 = Input ( Bool () )
    val in3 = Input ( Bool () )
    val in4 = Input ( Bool () )
    val in5 = Input ( Bool () )
    val in6 = Input ( Bool () )
    val in7 = Input ( Bool () )
    val sel = Input ( UInt (3. W ) )
    val s1 = Input ( Bool () )
    val s2 = Input ( Bool () )
    val s3 = Input ( Bool () )
    val out = Output ( Bool () )
}

class Mux8to1 extends Module{
    val io = IO(new MuxLookup)

io . out := MuxCase ( false .B , Array (
( io . sel ===0. U ) -> io . in0 ,
( io . sel ===1. U ) -> io . in1 ,
( io . s1 ===2. U ) -> io . in2 ,
( io . s1 ===3. U ) -> io . in3 ,
( io . s2 ===4. U ) -> io . in4 ,
( io . s2 ===5. U ) -> io . in5 ,
( io . s3 ===6. U ) -> io . in6 ,
( io . s3 ===7. U ) -> io . in7 )
)

}

