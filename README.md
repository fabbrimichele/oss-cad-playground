# SpinalHDL - OSS CAD Playground

To generate the Verilog
```sh
sbt "runMain projectname.MyTopLevelVerilog"
```

To generate the VHDL from the example
```
sbt "runMain projectname.MyTopLevelVhdl"
```

To run the testbench
```
sbt "runMain projectname.MyTopLevelSim"
```

* The hardware description is into `hw/spinal/projectname/MyTopLevel.scala`
* The testbench is into `hw/spinal/projectname/MyTopLevelSim.scala`
