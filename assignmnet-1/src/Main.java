import java.io.Console;
import java.io.Reader;

public class Main {

	public static void main(String[] args) {
		
		//Hello World
		System.out.println("Hello World");
		
		//De�i�kenler
		int dersNo = 1;
		System.out.println("�zlenen ders : " + dersNo);
		
		//De�i�kenler
		{
			boolean degisken = false; System.out.println(degisken);
			char degisken1 = 'A'; System.out.println(degisken1);
			byte d1= -128; System.out.println(d1);
			short d2= 32767; System.out.println(d2);
			int d3= 5; System.out.println(d3);
			long d4= 555555555; System.out.println(d4);
			float d5= 888888888; System.out.println(d5);
			double d6= 2.28; System.out.println(d6);
			
		}
		
		//if-else
		if(dersNo==1) {
			System.out.println("1.dersi izeldiniz");
		}else {
			System.out.println("Farkl� bir dersi izeldiniz");
		}
		
		
		//En B�y�k say�
		{
			int s1 = 11;
			int s2 = 12;
			int s3 = 13;
			int s4 = 14;
			int enBuyuk = s3;
			
			if(s4>s3) {
				enBuyuk = s4;
				System.out.println("En buyuk say�: " + enBuyuk);
			}
		}
		
		
		//Switch-Case
		{
			//Console console = System.console();
			//String day = console.readLine("Ge�erli G�n� Giriniz : ");
			String day = "test";
			switch(day) {
				case("Pazartesi"):
					System.out.println("Bug�n: " + day);
					break;
				case("Sal�"):
					System.out.println("Bug�n: " + day);
					break;
				case("�ar�amba"):
					System.out.println("Bug�n: " + day);
					break;
				default:
				System.out.println("Bug�n: Haftasonu");
				break;
					
			}
		}
		
		
		//For D�ng�s�
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==9) {
				System.out.println("D�ng� bitti");
			}
		}
		
		//while
		//int i=0;
		while(i<5) {
			System.out.println("\"i\" say�s� 1 arrt� yeni de�er = "+i);
			i++;
		}
		
		

		
	}

}
