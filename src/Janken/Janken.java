package Janken;

import java.util.Random;
import java.util.Scanner;

public class Janken{
	public static void main(String[] args) {

		//�����������邽�߂ɐ錾
		Random r = new Random();
		
		//��ʂ���̐��l����
		//TODO:���l�ȊO�������Ă�����G���[�𓊂���悤�ɂ���
		Scanner scan = new Scanner(System.in);
		
		//�����Ƒ���̎�̏����l
		int hand = -100;
		int handCPU = 101;
		
		for(int i=0; i<5; i++) {
			
			//���͂�������i�[
			hand = scan.nextInt();
			handCPU = r.nextInt(3);
			
			//���������p�^�[��
			if((hand - handCPU) == 0) {
				System.out.println("��������");
			}
			
			//�����p�^�[��
			else if((hand - handCPU) == -1 || (hand - handCPU) == 2) {
				System.out.println("����");
			}
			
			//�����p�^�[��
			else {
				System.out.println("����");
			}
		}
	}
}
