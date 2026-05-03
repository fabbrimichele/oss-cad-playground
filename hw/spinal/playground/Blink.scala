package playground

import spinal.core._

import scala.language.postfixOps

case class Blink() extends Component {
  val io = new Bundle {
    val led = out Bool()
  }

  //val mainArea = new ClockingArea(topClockDomain) {
    val counter = Reg(UInt(24 bits)) init 0
    val ledStatus = Reg(Bool()) init True

    when(counter === 12_500_000) {
      counter := 0
      ledStatus := !ledStatus
    } otherwise {
      counter := counter + 1
    }

    io.led := ledStatus
  //}
}

object BlinkVerilog extends App {
  Config.spinal.generateVerilog(Blink())
}

object BlinkVhdl extends App {
  Config.spinal.generateVhdl(Blink())
}