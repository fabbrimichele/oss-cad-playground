# SpinalHDL - OSS CAD Playground

* The hardware description is into `hw/spinal/playground/Blink.scala`
* The testbench is into `hw/spinal/playground/BlinkSim.scala`

## How to install
1. Install [OSS CAD Suite](https://github.com/yosyshq/oss-cad-suite-build#installation)
2. Configure openFPGALoadr (see also [install guide](https://trabucayre.github.io/openFPGALoader/guide/install.html#udev-rules))
   1. Download and copy [99-openfpgaloader.rules](https://github.com/trabucayre/openFPGALoader/blob/master/99-openfpgaloader.rules) to `/etc/udev/rules.d` 
   2. Add the 2 lines below to `/etc/udev/rules.d/99-openfpgaloader.rules` (see [issue-1962212397](https://github.com/trabucayre/openFPGALoader/issues/398#issue-1962212397))
   ```sh
   # IceSugar-Pro
   ATTRS{idVendor}=="1d50", ATTRS{idProduct}=="602b", MODE="664", GROUP="plugdev", TAG+="uaccess"```
   ```
   3. Test the board
   ```sh
    openFPGALoader -c cmsisdap --vid=0x1d50 --pid=0x602b --detect
    ```

## How to build
Depending on your Linux configuration you might need to run `enable-oss-cad.sh` to set 
the OSS CAD environment variables.

To run the testbench:
```
sbt "runMain playground.BlinkSim"
```
To generate the Verilog:
```sh
make hw/gen/Blink.v
```
To generate the bit stream:
```sh
make
```
To load to the FPGA the bit stream:
```sh
make prog
```
To load to the FLASH (permanent) the bit stream:
```sh
make prog-flash
```
To view the simulation wave form:
1. Run the simulation
2. ```
   make view-wave
   ```
