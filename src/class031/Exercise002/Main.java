package class031.Exercise002;

public class Main {

	public static void main(String[] args) {
		NaturalPerson p1 = new NaturalPerson("Lorenzo", 1200, "54857845");
		LegalPerson p2 = new LegalPerson("Fábio", 1200, "53454552");
		NaturalPerson p3 = new NaturalPerson("Eduardo", 4500, "31551545");
		LegalPerson p4 = new LegalPerson("Luciana", 6800, "35245524");
		NaturalPerson p5 = new NaturalPerson("João", 3250, "2524525");
		
		Taxpayer[] taxpayers = new Taxpayer[5];
		taxpayers[0] = p1;
		taxpayers[1] = p2;
		taxpayers[2] = p3;
		taxpayers[3] = p4;
		taxpayers[4] = p5;

		for(Taxpayer tax: taxpayers) {
			System.out.println(tax.toString());
		}
		
	}

}
