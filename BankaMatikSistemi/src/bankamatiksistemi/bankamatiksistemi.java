package bankamatiksistemi;

import java.util.Scanner;

public class bankamatiksistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner bilgi = new Scanner(System.in);
		int bakiye = 1000;
		
		System.out.println("O.B. Bank'a Ho�geldiniz...");
		System.out.println("");
		System.out.println("Yap�ca��n�z ��lemi Se�in...");
		System.out.println("");
		while(true) {
			
		
		System.out.println("1. Bakiye Sorgulama = ");
		System.out.println("2. Para Yat�rma ��lemi = ");
		System.out.println("3. Para �ekme ��lemi = ");
		System.out.println("4. Sistemden ��k = ");
		
		int islem = bilgi.nextInt();
		
		
		switch(islem) {
		
		case 1:
			System.out.println("Toplam Bakiyeniz = " + bakiye);
			System.out.println("");
		
		break;
		
		case 2:
			System.out.println("Yat�rmak �stedi�iniz Tutar = ");
			int miktar = bilgi.nextInt();
			
			bakiye += miktar;
			System.out.println("");
			System.out.println("");
			System.out.println("Toplam Bakiyeniz = " + bakiye);
			System.out.println("");
			
			
		break;
		
		case 3:
			System.out.println("�ekmek �stedi�iniz Tutar = ");
			 miktar = bilgi.nextInt();
			
			bakiye -= miktar;
			System.out.println("");
			System.out.println("");
			System.out.println("Kalan Bakiyeniz = " + bakiye);
			System.out.println("");
			
		break;
		
		case 4:
			System.out.println("");
			System.out.println("Sistemden ��k�l�yor...");
			System.out.println("");
		break;
		
		default :
			System.out.println("Hatal� ��lem Yapt�n�z...");
			System.out.println("");
		break;

		
		}
		}
		

	}

}
