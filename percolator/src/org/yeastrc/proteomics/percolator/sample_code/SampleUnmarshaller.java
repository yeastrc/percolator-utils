package org.yeastrc.proteomics.percolator.sample_code;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.IPeptide;
import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.IPeptides;
import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.IPercolatorOutput;
import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.IPsmIds;
import org.yeastrc.proteomics.percolator.out.utils.GetPercolatorJAXBContextObject;

public class SampleUnmarshaller {

	public static void main(String[] args) throws JAXBException {

		File percDir = new File("/data/run_space/CrossLinks/Crosslinks_Importer/Sample_Percolator_files_2015_01_13/Sample_Files_From_Crosslinks_Server/");
		
		File percFile13 = new File(percDir,"sample_percout_13.xml");

		File percFile15 = new File(percDir,"sample_percout_15.xml");
		
		JAXBContext jaxbContext = GetPercolatorJAXBContextObject.getPercolatorJAXBContextObjectForAllFormats();

		unmarshalFile( percFile13, jaxbContext );
		unmarshalFile( percFile15, jaxbContext );
	}
	

	private static void unmarshalFile( File percFile, JAXBContext jaxbContext ) throws JAXBException {
		
		
		Unmarshaller u = jaxbContext.createUnmarshaller();
		
		IPercolatorOutput iperc = (IPercolatorOutput) u.unmarshal( percFile );
		
		if ( iperc instanceof com.per_colator.percolator_out._13.PercolatorOutput ) {
			com.per_colator.percolator_out._13.PercolatorOutput po = (com.per_colator.percolator_out._13.PercolatorOutput) iperc;
			
			System.out.println( "version 13 for input file: " + percFile.getAbsolutePath() );
		}

		
		if ( iperc instanceof com.per_colator.percolator_out._15.PercolatorOutput ) {
			com.per_colator.percolator_out._15.PercolatorOutput po = (com.per_colator.percolator_out._15.PercolatorOutput) iperc;
			
			System.out.println( "version 15 for input file: " + percFile.getAbsolutePath() );
		}

		IPeptides iIPeptides = iperc.getPeptides();
		
		List<? extends IPeptide> peptideList = iIPeptides.getPeptide();
		
		for ( IPeptide ipeptide : peptideList ) {
			
			IPsmIds iPsmIds = ipeptide.getPsmIds();
			
			List<String> psmidList = iPsmIds.getPsmId();
			
			int z = 0;
		}
		
	    int z = 0;
	}
	
}
