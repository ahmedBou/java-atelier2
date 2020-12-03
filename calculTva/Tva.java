package calculTva;

public class Tva {
	public static void main(String[] args) {
		int priceOfArticle = 120;
		int numberOfArticle = 3;
		double tva = 20.0/100.0;
		//System.out.print(tva);
		double resultTva = (priceOfArticle * numberOfArticle) * tva;
		System.out.print("prix total ttc :" + resultTva);
	}
}
