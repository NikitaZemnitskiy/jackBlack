import java.util.Scanner;
public class Fishki extends Main {
	static int fishka = 1000;
	static int stavka = 0;
	public static void Pravila() {
	String q = " ";
	System.out.println("Вітаемо вас у грі ЧорнийДжек");
	System.out.println("На старте вам выдается 1000 фишек");
	System.out.println("На каждую игру вы можете поставить любое количество имеющихся фишек");
	System.out.println("В случае победы ваши фишки удваиваются, а при поражении они удаляются");
	System.out.println("Вам понятны правила?");
	System.out.println ("1 - да");
	System.out.println ("2 - нет");
	Scanner scan = new Scanner (System.in);
	//Всякие штуки против дыбилов
	switch (scan.next()) {
	case "да": q = "1";break;
	case "Да": q = "1";break;
	case "понятны": q = "1";break;
	case "Понятны": q = "1";break;
	case "понятно": q = "1";break;
	case "Понятно": q = "1";break;
	case "1": q = "1";break;
	case "нет": q = "0";break;
	case "Нет": q = "0";break;
	case "2": q = "0";break;
	default: System.out.println("Ты нормально что-нибудь ввести можешь? Например да или нет. Можешь 1 или 2, но нормальное!");
	Fishki.Pravila();break;
	}
	switch (q) {
	case "1": System.out.println("Это хорошо, что ты такой понятливый");
	System.out.println("Тогда игра начинается! Gl HF");
	break;
	case "0": System.out.println("Прочти еще раз");Fishki.Pravila();break;
	}
	System.out.println(" ");
}
	public static void Stavochka() {
		if (fishka ==0) {
			System.out.println("Game over");
			System.exit(0);
		}
		System.out.println("Введите сумму, которую хотите поставить (Только целые !ЧИСЛА!). Ваш баланс - "+ fishka + " фишек" );
		Scanner scan = new Scanner (System.in);
		stavka = scan.nextInt();
		if (stavka<0) {
			System.out.println("Отрицательные числа не стоит вписывать!");Fishki.Stavochka(); 
		}
		else if (stavka>fishka) {
			System.out.println("У тебя столько нет!");Fishki.Stavochka();
		}
			else if  (stavka<=fishka) {
				fishka -= stavka; 
			System.out.println("Ваша ставка -  " + stavka + ". У вас еще осталось - " + fishka);}
			else {
				System.out.println("Неправильная ставка!");Fishki.Stavochka();
			}
		}
	public static void PodschetFishek(int p) {
		System.out.println(" ");
		switch (p) {
		case 0: System.out.println("Вы теряете свою ставку в размере - " + stavka + ". У вас еще осталось - " + fishka + " Фишек" );
		Main.OsnovnoyCikl();
		case 1: fishka += (stavka *2);  
			System.out.println("Вы удваиваете свою ставку в размере - " + stavka + " У вас теперь - " + fishka  +" Фишек" );
		Main.OsnovnoyCikl();
		case 2:
			fishka+=stavka; 
			System.out.println("Ваше количество фишек осталось не изменным -" + fishka);
			Main.OsnovnoyCikl();
	}
	}
}
	
