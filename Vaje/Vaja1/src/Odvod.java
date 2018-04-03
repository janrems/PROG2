
public class Odvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] polinom = {1,2,3};
		double[] rezultat = odvod(polinom, 1);
		for (int i = 0; i < rezultat.length; i ++ ){
			System.out.print(rezultat[i] + " ");
		}
	}
	private static double[] odvod (double[] p, int n){
		final int DOL = p.length;
		if (n > DOL){
			return new double[0];
		} else {
			double[] nov = new double[DOL-n];
			for (int j = 1; j <= n; j += 1){
				for (int i = n; i < DOL; i += 1){
					if (j == 1) {
						nov[i-n] = p[i];
					}
					nov[i-n] = nov[i-n]*(i-j+1);
				}
			}
			return nov;
		}
}
}