# percolator-utils

Code to read a Percolator file.

The classes generated from the Percolator ouput XSD definitions have been modified
to implement a set of interfaces under src/org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces
so that for the properties common across the various Percolator versions those properties can be accessed
by code referencing the interfaces.

Other properties can be accessed by casting to the concrete classes.


**  Building:

**  Build using ant

Running the command line tool "ant" in the current directory will result in a jar 
in the "deploy" dir named "percolator_reader_lib.jar".

"ant" by default will use the file "build.xml".


