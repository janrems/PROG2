
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
public class PredorMetod {

	
	public static int predorM (String imeVhod, String imeIzhod) throws IOException {
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		int stevec = 0;
		while (vhod.ready()){
			String vrstica = vhod.readLine().trim();
			String[] besede = vrstica.split(" +");
			int zacetna = Integer.parseInt(besede[0]);
			int koncna = Integer.parseInt(besede[1]);
			String registrska = besede[2];
			
			// da prikazemo na dve decimalki
			DecimalFormatSymbols symbol = new DecimalFormatSymbols();
			symbol.setDecimalSeparator('.');
			DecimalFormat df = new DecimalFormat("0.00", symbol);
			df.setRoundingMode(RoundingMode.HALF_UP);
					
			int cas = koncna - zacetna;
			double avg_v =  622.0 / cas;
			if (avg_v * 3.6 > 80) {
				stevec ++;
				izhod.write(registrska + " " + df.format(avg_v)  + System.lineSeparator());
				}
			
			}
		vhod.close();
		izhod.close();
		return stevec;
		}

}

