import java.util.Scanner;
public class logika extends Peretasovka {								
	static int PK = 0;                              //������ ������
	static int k = 0;								// ����� ������� � ������� ������
	static int TI = 0;							// �������� ���� � ������
	static int TK = 0;						   //�������� ���� � ������
	static int p = 0;							// ����� ������� � ������ ������
	static int PI = 0;                            //������ ������
	public static void Nachalo() {	             //������ 1 ����� ������ � 2 ������ � ������������ �� ���������
		PK = stoimostArr[51 - k];
		System.out.println ("����� ������: ");
			System.out.println (arr[51 - k]);
			System.out.println ("�������� ��� ���� - " + PK );
			
			System.out.println (" ");
			
			PI = stoimostArr[p] + stoimostArr[p+1];
			System.out.println ("���� �����: ");
				System.out.println (arr[p]);
				System.out.println (arr[p+1]);
				System.out.println ("�������� ����� ���� - " + PI );
				System.out.println (" ");
				
				if(stoimostArr[p] + stoimostArr[p+1] + stoimostArr[51 - k] + stoimostArr[51  - k]  == 42) { // ��������, ��� �� ��������� � ������ � � ������ ������������
					System.out.println("� ������ ��������!!!");
					System.out.println("��� ����, � ��� ���� BLACKJAK!!!! ��� �� �����!!!!!!");
				
					Fishki.PodschetFishek(2);
				}
				if(stoimostArr[51 - k] + stoimostArr[50 - k] == 21) { // ��������, ��� �� ��������� � ������ (��������� ��������� ���� ��������)
					System.out.println("������ ����� ������ - " + arr[50 - k]);
					System.out.println("� ������ ��������!!! �� ���������!");
					
					Fishki.PodschetFishek(0);
				}
				if(stoimostArr[k] + stoimostArr[k+1] == 21) { // ��������, ��� �� ��������� � ������ (��������� ��������� ���� ��������)
					System.out.println("������ ����� ������ - " + arr[k+1]);
					System.out.println("� ��� ��������!!! �� ��������!!!!");
					Fishki.PodschetFishek(1);
				}
				//�������� �����
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
		String q = " ";//�������������� ���������� ��� ��������� ������� 
		System.out.println ("�� ������ ����� ��� 1 �����? ");
		System.out.println ("�������� �������: ");
		System.out.println ("1- ��");
		System.out.println ("2- ���");
		Scanner scan = new Scanner (System.in);
		//������ ����� ������ �������
		switch (scan.next()) {
		case "��": q = "1";break;
		case "��": q = "1";break;
		case "����": q = "1";break;
		case "����": q = "1";break;
		case "����": q = "1";break;
		case "����": q = "1";break;
		case "1": q = "1";break;
		case "���": q = "0";break;
		case "���": q = "0";break;
		case "2": q = "0";break;
		default: System.out.println("�� ��������� ���-������ ������ ������? �������� �� ��� ���. ������ 1 ��� 2, �� ����������!");
		logika.IgraIgroka();break;
		}
		switch (q) {
		case "0":System.out.println ("����� ������� ������ ����� �����");break;
		case "1": 
			System.out.println ("�� ����� ����� " + arr[p +2]);
		PI += stoimostArr[p+2];
		if (stoimostArr[p+2] == 11) {
			TI++; 
		}
		p++;
		//�������� ����, ������� ������� � ������
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
		System.out.println ("������ ��������� ����� ���� = " + PI);
		switch (point) {
		case 21: System.out.println ("�����������! � ��� 21. ������ ������� ������ ����� �����");break;
		case 1: System.out.println ("� ��� �������. �� ���������!("); Fishki.PodschetFishek(0); break;//���� � ������ �������, �� ������������� ���������
		case 0: logika.IgraIgroka();break;
		}
		}
	}
	public static void IgraKrupE() {//������ ����� ����� ���� � ���� �� ����� �� ������ 16 �����
		System.out.println (" ");
		System.out.println ("C�������� ����� ������ - " + arr[50 - k]);
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
		System.out.println ("��������� ���� ������ - " + PK);
		switch(point) {
		case 1: System.out.println("������ ������ �� ����� ����� �����");break;
		case 0: logika.IgraKrupE();break;
		case 2: System.out.println("� ������ �������( �� ��������!!!!");Fishki.PodschetFishek(1);break;
		
	}
}
	public static void SravnivaniePointov() {
		System.out.println(" ");
		System.out.println("���� ���� - " + PI);
		System.out.println("���� ������ - " + PK);
		
		if(PK > PI) {
			System.out.println("� ������ ������ �����! �� ���������!");
			Fishki.PodschetFishek(0);
		}
		if(PK < PI) {
			System.out.println("� ��� ������ �����! �� ��������!!!!");
			Fishki.PodschetFishek(1);
		}
		if(PK == PI) {
			System.out.println("� ��� � ������ ��������� �����!!! ��� �����!!!!");
			Fishki.PodschetFishek(2);
		}
	}
}
