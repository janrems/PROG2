import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;

public class Predor {
	
	public static int predor(String imeVhod, String imeIzhod) throws IOException{
		FileReader datoteka = new FileReader(imeVhod);
		BufferedReader bralec = new BufferedReader(datoteka);
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		int stevec = 0;
		while (bralec.ready()){
			String vrstica = bralec.readLine().trim();
			String[] besede = vrstica.split(" +");
			int zacetna = Integer.parseInt(besede[0]);
			int koncna = Integer.parseInt(besede[1]);
			String registracija = besede[2];
			
			// zapis na dve decimalki
			DecimalFormatSymbols symbol = new DecimalFormatSymbols();
			symbol.setDecimalSeparator('.');
			DecimalFormat df = new DecimalFormat("0.00", symbol);
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			double cas = koncna - zacetna;
			double povprecnaHitrost = 622.0/ cas;
			if (povprecnaHitrost * 3.6 > 80.0){
				stevec ++;
				izhod.write(registracija + " " + df.format(povprecnaHitrost) + System.lineSeparator());
			}
		}
		bralec.close();
		izhod.close();
		return stevec;
	}
	
}
