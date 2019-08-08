import java.util.Scanner;
public class logika extends Peretasovka {								
	static int PK = 0;                              //Поинты крупье
	static int k = 0;								// Номер массива с кайртой крупье
	static int TI = 0;							// Проверка туза у игрока
	static int TK = 0;						   //Проверка туза у крупье
	static int p = 0;							// номер массива с картой игрока
	static int PI = 0;                            //Поинты игрока
	public static void Nachalo() {	             //Выдаем 1 карту крупье и 2 игроку с озвучиванием их стоимости
		PK = stoimostArr[51 - k];
		System.out.println ("Карты крупье: ");
			System.out.println (arr[51 - k]);
			System.out.println ("Ценность его карт - " + PK );
			
			System.out.println (" ");
			
			PI = stoimostArr[p] + stoimostArr[p+1];
			System.out.println ("Ваши карты: ");
				System.out.println (arr[p]);
				System.out.println (arr[p+1]);
				System.out.println ("Ценность ваших карт - " + PI );
				System.out.println (" ");
				
				if(stoimostArr[p] + stoimostArr[p+1] + stoimostArr[51 - k] + stoimostArr[51  - k]  == 42) { // Проверка, нет ли блекДжека у Крупье и у Игрока одновременно
					System.out.println("У крупье БЛЕКДЖЕК!!!");
					System.out.println("ВОТ ЧЕРТ, у ВАС тоже BLACKJAK!!!! Это же НИЧЬЯ!!!!!!");
				
					Fishki.PodschetFishek(2);
				}
				if(stoimostArr[51 - k] + stoimostArr[50 - k] == 21) { // Проверка, нет ли блекДжека у крупье (Остановка программы если блекДжек)
					System.out.println("Вторая карта крупье - " + arr[50 - k]);
					System.out.println("У крупье БЛЕКДЖЕК!!! вы проиграли!");
					
					Fishki.PodschetFishek(0);
				}
				if(stoimostArr[k] + stoimostArr[k+1] == 21) { // Проверка, нет ли блекДжека у игрока (Остановка программы если блекДжек)
					System.out.println("Вторая карта крупье - " + arr[k+1]);
					System.out.println("У Вас БЛЕКДЖЕК!!! ВЫ ПОБЕДИЛИ!!!!");
					Fishki.PodschetFishek(1);
				}
				//Проверка Тузов
				if (stoimostArr[0] == 11) {
					TI += 1;}
				if (stoimostArr[1] == 11) {
					TI += 1;}
				if (stoimostArr[51] == 11) {
					TK += 1;}
				if (stoimostArr[50] == 11) {
					TK += 1;}
	}
	public static void IgraIgroka() {
		String q = " ";//Дополнительная переменная для вариантов ответов 
		System.out.println ("Вы будете брать еще 1 карту? ");
		System.out.println ("Варианты ответов: ");
		System.out.println ("1- да");
		System.out.println ("2- нет");
		Scanner scan = new Scanner (System.in);
		//Всякие штуки против дыбилов
		switch (scan.next()) {
		case "да": q = "1";break;
		case "Да": q = "1";break;
		case "буду": q = "1";break;
		case "Буду": q = "1";break;
		case "беру": q = "1";break;
		case "Беру": q = "1";break;
		case "1": q = "1";break;
		case "нет": q = "0";break;
		case "Нет": q = "0";break;
		case "2": q = "0";break;
		default: System.out.println("Ты нормально что-нибудь ввести можешь? Например да или нет. Можешь 1 или 2, но нормальное!");
		logika.IgraIgroka();break;
		}
		switch (q) {
		case "0":System.out.println ("Тогда очередь крупье брать карту");break;
		case "1": 
			System.out.println ("Вы взяли карту " + arr[p +2]);
		PI += stoimostArr[p+2];
		if (stoimostArr[p+2] == 11) {
			TI++; 
		}
		p++;
		//проверка того, сколько поинтов у игрока
		int point = 0;
		if (PI ==21) 
			point = 21;
		if (PI >21) {
			point = 1;
			if (TI > 0) {
				PI = PI - 10;
				TI -= 1 ;
				point = 0;
			}
		}
		if (PI <21)
			point = 0;
		System.out.println ("Теперь стоимость ваших карт = " + PI);
		switch (point) {
		case 21: System.out.println ("Поздравляем! У вас 21. Сейчас очередь крупье брать карту");break;
		case 1: System.out.println ("У вас перебор. Вы проиграли!("); Fishki.PodschetFishek(0); break;//Если у Игрока перебор, то останавливаем программу
		case 0: logika.IgraIgroka();break;
		}
		}
	}
	public static void IgraKrupE() {//Крупье берет карты пока у него не будет не меньше 16 очков
		System.out.println (" ");
		System.out.println ("Cледующая карта крупье - " + arr[50 - k]);
		PK += stoimostArr[50 - k];
		if (stoimostArr[50 - k] == 11) {
			TK++;}
		k++;
		int point = 0;
		if (PK >=16)
			point = 1;
		if (PK <16)
			point = 0;
		if (PK >21){
			point = 2;
			if (TK > 0) {
				PK = PK - 10;
				TK--;
				if (PK <16) {
					point = 0;}
				if (PK >=16) {
					point = 1;}
			}
		}
		System.out.println ("Стоимость карт крупье - " + PK);
		switch(point) {
		case 1: System.out.println("Крупье больше не будет брать карты");break;
		case 0: logika.IgraKrupE();break;
		case 2: System.out.println("У крупье перебор( ВЫ ПОБЕДИЛИ!!!!");Fishki.PodschetFishek(1);break;
		
	}
}
	public static void SravnivaniePointov() {
		System.out.println(" ");
		System.out.println("Ваши очки - " + PI);
		System.out.println("Очки крупье - " + PK);
		
		if(PK > PI) {
			System.out.println("У крупье больше очков! Вы проиграли!");
			Fishki.PodschetFishek(0);
		}
		if(PK < PI) {
			System.out.println("У вас больше очков! Вы ПОБЕДИЛИ!!!!");
			Fishki.PodschetFishek(1);
		}
		if(PK == PI) {
			System.out.println("У вас и Крупье одинаково очков!!! Это НИЧЬЯ!!!!");
			Fishki.PodschetFishek(2);
		}
	}
}
