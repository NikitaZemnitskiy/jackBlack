
public class Peretasovka extends Main {
	static int [] stoimostArr = {2,2,2,2, 
			3,3,3,3,
			4,4,4,4,
			5,5,5,5,
			6,6,6,6,
			7,7,7,7,
			8,8,8,8,
			9,9,9,9,
			10,10,10,10,
			10,10,10,10,
			10,10,10,10,
			10,10,10,10,
			11,11,11,11};
	static String arr[] = {"������ �����","������ ���","������ ����","������ ������", 
			"������ �����","������ ���","������ ����","������ ������",
			"�������� �����","�������� ���","�������� ����","�������� ������",
			"������� �����","������� ���","������� ����","������� ������",
			"�������� �����","�������� ���","�������� ����","�������� ������",
			"������� �����","������� ���","������� ����","������� ������",
			"��������� �����","��������� ���","��������� ����","��������� ������",
			"������� �����","������� ���","������� ����","������� ������",
			"������� �����","������� ���","������� ����","������� ������",
			"����� �����","����� ���","����� ����","����� ������",
			"���� �����","���� ���","���� ����","���� ������",
			"������ �����","������ ���","������ ����","������ ������",
			"��� �����","��� ���","��� ����","��� ������"};

	public static void potasuem() {
		String b;
		int l = 0;
		for(int i=0; i<52; i++) {
			int random = (int) ( Math.random() * 52 );
			b = arr[i];
			arr[i] = arr[random];
			arr[random] = b;
			
			l = stoimostArr[i];
			stoimostArr[i] = stoimostArr[random];
			stoimostArr[random] = l;}
	}
	
}

