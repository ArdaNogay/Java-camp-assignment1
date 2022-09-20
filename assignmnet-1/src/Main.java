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
		int i=0;
		while(i<5) {
			System.out.println("\"i\" say�s� 1 arrt� yeni de�er = "+i);
			i+=1;
		}
		
		//Do-while
		double j = 2;
		do {
			System.out.println("J de�eri = " +j);
			j++;
		}while(j<12);
		
		//Diziler
		int[] tekSayilar = {1,3,5,7,9,11,13,15,17,19};
		for(int gezgin:tekSayilar) {
			System.out.println(gezgin);
		}
		
		//ReCap Demo2
		int[] sayilar = {1,5,6,3,2,4,5,11,8,6};
		int enBuyuk=sayilar[0];
		for(int s:sayilar) {
			if(enBuyuk<s) {
				enBuyuk = s;
			}
		}
		System.out.println("En buyuk sayi: "+enBuyuk);
		
		
		//�ok Boyutlu Dizi
		String[][] sehirler = new String[2][2];
		sehirler[0][0] = "Antalya";
		sehirler[0][1] = "Isparta";
		sehirler[1][0] = "�stanbul";
		sehirler[1][1] = "�zmir";
				
		for(int i1 =0;i1<2;i1++) {
			for(int j1 =0;j1<2;j1++) {
				System.out.println(sehirler[i1][j1]);
			}
		}
		
		//Stringler
		String message1 = "En g�zel say� 8'dir.";
		System.out.println(message1.length());
		System.out.println(message1.concat(" Di�eride 08"));
		System.out.println("2. eleman"+ message1.charAt(1));
		System.out.println(message1.startsWith("En"));
		System.out.println(message1.endsWith("."));
		char[] karakterler = new char[5];
		message1.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message1.indexOf('8'));
		System.out.println(message1.lastIndexOf('�'));
		System.out.println(message1.replace('8', '0'));
		System.out.println(message1.substring(3,15));
		for(String kelime:message1.split(" ")) {
			System.out.println(kelime);

		}
		System.out.println(message1.toLowerCase());
		System.out.println(message1.toUpperCase());
		System.out.println(message1.trim());
		
		
		//Asal say� bulma
		{
			int[] sayilar1 = {25,13};
			for(int asaliBul:sayilar1) {
				if(asaliBul==1) {
					System.out.println(asaliBul +" say�s� asal de�ildir.");
					continue;
				}else if(asaliBul<1) {
					System.out.println("Ge�ersiz say�");
					return;
				}
				boolean asal = true;
				for(int i1 =2;i1<asaliBul;i1++) {
					if(asaliBul % i1 == 0) {
						asal = false;
					}
				}
				if(asal) {
					System.out.println(asaliBul +" say�s� asald�r.");
				}else {
					System.out.println(asaliBul +" say�s� asal de�ildir.");		
				}
			}
		}
		
		
		//�nce ve Kal�n sesli harfler
		
		{
			char harf = 'E';
			
			switch(harf) {
			case'A':
			case'I':
			case'O':
			case'U':
				System.out.println("Kal�n sesli harf");
				break;
			default:
				System.out.println("�nce sesli harf");
				break;
			}
		}
		
		//M�kemmel Say�lar
		
		{
			int sayii = 29;
			int topla = 0;
			for(int i1 = 1;i1<sayii;i1++) {
				if(sayii % i1 == 0) {
					topla+=i1;
				}
			}
			if(sayii==topla) {
				System.out.println("Say�n�z m�kemmel bir say�d�r");
			}else {
				System.out.println("Say�n�z m�kemmel bir say� de�ildir");
			}
		}
		
		//Arkada� Say�lar
		{
			int[] toplam1 =new int[2];
			int[] sayilarr= {220,284};
			int x = 0;
			for(int sayi:sayilarr) {
				int topla = 0;
				for(int i1 = 1;i1<sayi;i1++) {
					if(sayi % i1 == 0) {
						topla+=i1;
					}
				}
				toplam1[x]=topla;
				x++;
			}
			if(toplam1[0]==sayilarr[1] && toplam1[1]==sayilarr[0]) {
				System.out.println("Bu iki say� arkada�t�r.");
			}
			
		}
		
		//Sayi Bulma
		{
			int[] sayiDizisi = {1,2,3,4,5,6,7,8,9,0};
			
			int aranacak = 10;
			
			for(int deger:sayiDizisi) {
				if(deger==aranacak) {
					System.out.println(deger +" Say�s� bu dizide mevcuttur");
				}
			}
		}
		

	}

}
