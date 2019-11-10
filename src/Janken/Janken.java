package Janken;

import java.util.Random;
import java.util.Scanner;

public class Janken{
	public static void main(String[] args) {

		//乱数生成するために宣言
		Random r = new Random();
		
		//画面からの数値入力
		//TODO:数値以外が入ってきたらエラーを投げるようにする
		Scanner scan = new Scanner(System.in);
		
		//自分と相手の手の初期値
		int hand = -100;
		int handCPU = 101;
		
		for(int i=0; i<5; i++) {
			
			//入力した手を格納
			hand = scan.nextInt();
			handCPU = r.nextInt(3);
			
			//引き分けパターン
			if((hand - handCPU) == 0) {
				System.out.println("引き分け");
			}
			
			//勝ちパターン
			else if((hand - handCPU) == -1 || (hand - handCPU) == 2) {
				System.out.println("勝ち");
			}
			
			//負けパターン
			else {
				System.out.println("負け");
			}
		}
	}
}
