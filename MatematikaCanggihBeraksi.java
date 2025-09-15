public class MatematikaCanggihBeraksi{
	public static void main(String[]args){
		MatematikaCanggih MC = new MatematikaCanggih();
		int hasilTambah = MC.pertambahan(20, 20);
		System.out.println("Pertambahan 20 + 20 = " + hasilTambah);
		int hasilKali = MC.perkalian(10, 20);
		System.out.println("Perkalian 10 x 20 = " + hasilKali);
		int hasilModulus = MC.Modulus(147, 10);
		System.out.println("Modulus dari 147 sampai 10 = " + hasilModulus);
	}
}