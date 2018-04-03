import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SteviloBesed {

	public static void main(String[] args) throws IOException {
		String vhod = "besede.txt";
		String izhod = "vrstice.txt";
		System.out.println(stetje(vhod, izhod));
	}
	
	private static int stetje(String imeVhod, String imeIzhod) throws IOException {
		FileReader datoteka = new FileReader(imeVhod);
		BufferedReader bralec = new BufferedReader(datoteka);
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod));
		int stevec = 0;
		int character;
		while((character = bralec.read()) != -1){
			String vrstica = bralec.readLine();
			if (vrstica.equals("")){
				continue;
			}else{
				String [] besede = vrstica.split(" +");
				stevec += besede.length;
				for (String beseda: besede){
					izhod.write(beseda + System.lineSeparator());
				}
					
				}
		}
		bralec.close();
		izhod.close();
		return stevec;
	}
}
