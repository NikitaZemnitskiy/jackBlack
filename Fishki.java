import java.util.Scanner;
public class Fishki extends Main {
	static int fishka = 1000;
	static int stavka = 0;
	public static void Pravila() {
	String q = " ";
	System.out.println("³����� ��� � �� ����������");
	System.out.println("�� ������ ��� �������� 1000 �����");
	System.out.println("�� ������ ���� �� ������ ��������� ����� ���������� ��������� �����");
	System.out.println("� ������ ������ ���� ����� �����������, � ��� ��������� ��� ���������");
	System.out.println("��� ������� �������?");
	System.out.println ("1 - ��");
	System.out.println ("2 - ���");
	Scanner scan = new Scanner (System.in);
	//������ ����� ������ �������
	switch (scan.next()) {
	case "��": q = "1";break;
	case "��": q = "1";break;
	case "�������": q = "1";break;
	case "�������": q = "1";break;
	case "�������": q = "1";break;
	case "�������": q = "1";break;
	case "1": q = "1";break;
	case "���": q = "0";break;
	case "���": q = "0";break;
	case "2": q = "0";break;
	default: System.out.println("�� ��������� ���-������ ������ ������? �������� �� ��� ���. ������ 1 ��� 2, �� ����������!");
	Fishki.Pravila();break;
	}
	switch (q) {
	case "1": System.out.println("��� ������, ��� �� ����� ����������");
	System.out.println("����� ���� ����������! Gl HF");
	break;
	case "0": System.out.println("������ ��� ���");Fishki.Pravila();break;
	}
	System.out.println(" ");
}
	public static void Stavochka() {
		if (fishka ==0) {
			System.out.println("Game over");
			System.exit(0);
		}
		System.out.println("������� �����, ������� ������ ��������� (������ ����� !�����!). ��� ������ - "+ fishka + " �����" );
		Scanner scan = new Scanner (System.in);
		stavka = scan.nextInt();
		if (stavka<0) {
			System.out.println("������������� ����� �� ����� ���������!");Fishki.Stavochka(); 
		}
		else if (stavka>fishka) {
			System.out.println("� ���� ������� ���!");Fishki.Stavochka();
		}
			else if  (stavka<=fishka) {
				fishka -= stavka; 
			System.out.println("���� ������ -  " + stavka + ". � ��� ��� �������� - " + fishka);}
			else {
				System.out.println("������������ ������!");Fishki.Stavochka();
			}
		}
	public static void PodschetFishek(int p) {
		System.out.println(" ");
		switch (p) {
		case 0: System.out.println("�� ������� ���� ������ � ������� - " + stavka + ". � ��� ��� �������� - " + fishka + " �����" );
		Main.OsnovnoyCikl();
		case 1: fishka += (stavka *2);  
			System.out.println("�� ���������� ���� ������ � ������� - " + stavka + " � ��� ������ - " + fishka  +" �����" );
		Main.OsnovnoyCikl();
		case 2:
			fishka+=stavka; 
			System.out.println("���� ���������� ����� �������� �� �������� -" + fishka);
			Main.OsnovnoyCikl();
	}
	}
}
	
