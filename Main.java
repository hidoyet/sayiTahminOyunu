package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random=new Random();
		int numRandom=random.nextInt(100);
		Scanner scanner=new Scanner(System.in);
		int right=0;
		System.out.println("0 ile 100 arasý bir sayý giriniz:");
		System.out.println(numRandom);
		while(right<5) {
			System.out.println("Tahmin ettiðiniz sayýyý giriniz: ");
			int numSelected=scanner.nextInt();
			if(numSelected==numRandom) {
				System.out.println("Doðru tahmin ettiiniz,tebrikler.Ödülünüzü bir ara alýrsýnýz.");
				break;
			}
			if(numSelected<0||numSelected>99) {
				System.out.println("Lütfen 0-100 arasý bir deðer girin.");
			}
			if(numSelected<numRandom) {
				System.out.println("Girdiðiniz sayý,bulmanýz gereken sayýdan küçüktür");
							}
			if(numSelected>numRandom) {
				System.out.println("Girdiðiniz sayý,bulmanýz gereken sayýdan büyüktür.");
			}
			right++;
			if((5-right)<1) {
				System.out.println("Hakkýnýz bitmiþtir,bir daha deneyiniz.");
				break;
			}
			System.out.println("Kalan hakkýnýz: "+(5-right));
		}
		
		
		
	}

}
