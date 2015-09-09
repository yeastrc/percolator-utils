
Code to read a Percolator file.

The classes generated from the Percolator ouput XSD definitions have been modified
to implement a set of interfaces under src/org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces
so that for the properties common across the various Percolator versions those properties can be accessed
by code referencing the interfaces.

Other properties can be accessed by casting to the concrete classes.


