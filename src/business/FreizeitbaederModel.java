package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FreizeitbaederModel {

    private Freizeitbad freizeitbad;

    
    
	public void schreibeFreizeitbaederInCsvDatei() {
		// Throw exception
		
		try {
			BufferedWriter aus = new BufferedWriter(new FileWriter("Freizeitbaeder.csv", true));
			aus.write(this.getFreizeitbad().gibFreizeitbadZurueck(';'));
			aus.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}



	public Freizeitbad getFreizeitbad() {
		return freizeitbad;
	}



	public void setFreizeitbad(Freizeitbad freizeitbad) {
		this.freizeitbad = freizeitbad;
	}

}