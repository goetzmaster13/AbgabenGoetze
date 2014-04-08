package goetzmaster;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JAXBContext jc = JAXBContext.newInstance("goetzmaster");
			Unmarshaller unmarsh = jc.createUnmarshaller();
			
			HardwareSettingsInfo hw= (HardwareSettingsInfo) unmarsh.unmarshal(new File("hardware_settings_info.xml"));
			for (int i = 0; i < hw.getGraphicsCard().getResolution().size(); i++) {
			      if (hw.getGraphicsCard().getResolution().get(i) instanceof Resolution) {
			    	Resolution g = (Resolution) hw.getGraphicsCard().getResolution().get(i);
			    	for(int j=0; j < g.getRefreshRate().size();j++){
			    		System.out.println("Resolution: "+g.getWidth()+"x"+g.getHeight()+ " Refreshrate: " + g.getRefreshRate().get(j).getRate());
			    	}
			        
			      }
			    }
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
