# SpinalHDL - OSS CAD Playground

* The hardware description is into `hw/spinal/playground/Blink.scala`
* The testbench is into `hw/spinal/playground/BlinkSim.scala`

## How to build
To run the testbench
```
sbt "runMain playground.BlinkSim"
```
To generate the Verilog
```sh
make hw/gen/Blink.v
```
To generate the bit stream
```sh
make
```
To load to the FPGA the bit stream
```sh
make prog
```
To load to the FLASH (permanent) the bit stream
```sh
make prog-flash
```
To view the simulation wave form
1. Run the simulation
2. ```
   make view-wave
   ```

