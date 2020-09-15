package bankamatiksistemi;

import java.util.Scanner;

public class bankamatiksistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner bilgi = new Scanner(System.in);
		int bakiye = 1000;
		
		System.out.println("O.B. Bank'a Hoþgeldiniz...");
		System.out.println("");
		System.out.println("Yapýcaðýnýz Ýþlemi Seçin...");
		System.out.println("");
		while(true) {
			
		
		System.out.println("1. Bakiye Sorgulama = ");
		System.out.println("2. Para Yatýrma Ýþlemi = ");
		System.out.println("3. Para Çekme Ýþlemi = ");
		System.out.println("4. Sistemden Çýk = ");
		
		int islem = bilgi.nextInt();
		
		
		switch(islem) {
		
		case 1:
			System.out.println("Toplam Bakiyeniz = " + bakiye);
			System.out.println("");
		
		break;
		
		case 2:
			System.out.println("Yatýrmak Ýstediðiniz Tutar = ");
			int miktar = bilgi.nextInt();
			
			bakiye += miktar;
			System.out.println("");
			System.out.println("");
			System.out.println("Toplam Bakiyeniz = " + bakiye);
			System.out.println("");
			
			
		break;
		
		case 3:
			System.out.println("Çekmek Ýstediðiniz Tutar = ");
			 miktar = bilgi.nextInt();
			
			bakiye -= miktar;
			System.out.println("");
			System.out.println("");
			System.out.println("Kalan Bakiyeniz = " + bakiye);
			System.out.println("");
			
		break;
		
		case 4:
			System.out.println("");
			System.out.println("Sistemden Çýkýlýyor...");
			System.out.println("");
		break;
		
		default :
			System.out.println("Hatalý Ýþlem Yaptýnýz...");
			System.out.println("");
		break;

		
		}
		}
		

	}

}
