package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random=new Random();
		int numRandom=random.nextInt(100);
		Scanner scanner=new Scanner(System.in);
		int right=0;
		System.out.println("0 ile 100 aras� bir say� giriniz:");
		System.out.println(numRandom);
		while(right<5) {
			System.out.println("Tahmin etti�iniz say�y� giriniz: ");
			int numSelected=scanner.nextInt();
			if(numSelected==numRandom) {
				System.out.println("Do�ru tahmin ettiiniz,tebrikler.�d�l�n�z� bir ara al�rs�n�z.");
				break;
			}
			if(numSelected<0||numSelected>99) {
				System.out.println("L�tfen 0-100 aras� bir de�er girin.");
			}
			if(numSelected<numRandom) {
				System.out.println("Girdi�iniz say�,bulman�z gereken say�dan k���kt�r");
							}
			if(numSelected>numRandom) {
				System.out.println("Girdi�iniz say�,bulman�z gereken say�dan b�y�kt�r.");
			}
			right++;
			if((5-right)<1) {
				System.out.println("Hakk�n�z bitmi�tir,bir daha deneyiniz.");
				break;
			}
			System.out.println("Kalan hakk�n�z: "+(5-right));
		}
		
		
		
	}

}
