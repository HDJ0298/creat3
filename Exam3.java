package chap04;
import java.util.Scanner;

/*
 	[���� ��� ���α׷�]
 	����ڿ��� �⵵�� �Է� �޾� ���⿩�θ� �Ǵ��Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���.
 	
 	[���� ���1]
 	�⵵�� �Է��ϼ���: 2023
 	�Է��Ͻ� ---�⵵�� ����Դϴ�.
 	
 	[���� ���2]
 	�⵵�� �Է��ϼ���: 2020
 	�Է��Ͻ� ---�⵵�� �����Դϴ�.
 	
 	[���� �Ǵ� �˰�����]
 	1.4�� ����� �ش� �����Դϴ�.
 	2.100�� ����� �ش� ����Դϴ�.
 	3.400�� ����� �ش� �����Դϴ�.
 	
 	=> 2023�� : ���, 2020��: ���� , 1900��: ���, 2000��: ����
 	100���� ������ �������� 400���� ������ �������� �ʴ� �ش� ������� �Ѵ�.
 	���� 400���� ������ �������� 2000���� �׷����������� ����������, 100���δ� ������ �������� 400���δ� ������ �������� �ʴ� 1900���� ����̴�. 
 	���� �����콺�����δ� 1900���̵� 2000���̵� ��� �����̴�.
 	
 	[�ڵ� �ۼ� ����]
 	1. if ... else if ... else ���� �̿��Ͽ� ������ �ذ� �ϼ���.
 	2. if.. else ������ �̿��Ͽ� ������ �ذ��ϼ���.
 	
 
 */

public class Exam3 {

	public static void main(String[] args) {
		 //1��
		/*
		Scanner sc = new Scanner(System.in);
		
		int year;
		String result = "";
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		year = sc.nextInt();
		
		sc.close();
		
		if(year % 400 ==0) {
			result = "����";
		}else if(year % 100 ==0) {
			result = "���";
		}else if(year % 4 ==0) {
			result = "����";
		}else {
			result = "���";
		}
		
		System.out.printf("�Է��Ͻ� %d���� %s�Դϴ�",year,result);
		
		*/
		
		//2
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		String result = "";
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		year = sc.nextInt();
		
		sc.close();
		
		if( (year %4 ==0 && year%100 !=0) || year%400==0 ) {
			result ="����";
		}else {
			result ="���";
		}
		
		System.out.printf("�Է��Ͻ� %d���� %s�Դϴ�",year,result);
		
		
		
		/* �����Ѱ� ��
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		num=sc.nextInt();
		
		
		if(num%400 == 0) {
			System.out.printf("�Է��Ͻ� %d���� �����Դϴ�.",num);
		}else if(num%100 == 0 && num%400 != 0) {
			System.out.printf("�Է��Ͻ� %d���� ����Դϴ�.",num);
		}else if(num%4 == 0) {
			System.out.printf("�Է��Ͻ� %d���� �����Դϴ�.",num);
		}else{
			System.out.printf("�Է��Ͻ� %d���� ����Դϴ�.",num);
		}
		
		sc.close();
		
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.print("�⵵�� �Է��ϼ���: ");
		num=sc.nextInt();
		
		if(num%400 ==0 || num%4==0 || num%100==0 && num%400 != 0 ){
			System.out.printf("�Է��Ͻ� %d���� �����Դϴ�.",num);
		}else{
			System.out.printf("�Է��Ͻ� %d���� ����Դϴ�.",num);
		}
		*/
		
				
		 
	}
	
	
}