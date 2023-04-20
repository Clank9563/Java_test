package tw.org.iii.tutor;

import java.util.Arrays;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = shuffle();
		// 發牌

		int[][] players = new int[4][13];
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
		}
//		players[0]使用for
//		for(int i=0;i<players[0].length;i++) {
//			System.out.println(players[0][i]);
//		}
//		System.out.println("-----");//一維
//		for(int v:players[0]) {
//			System.out.println(v);
//		}
//		System.out.println("-----");
		String[] suits = { "黑桃", "紅心", "方塊", "梅花" };
		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int[] player : players) {
			Arrays.sort(player);
			int[]cards = pairSort(player);
//			ReverseArray(player);反向排序
			for (int card : cards) {
				System.out.print(suits[card / 13] + values[card % 13] + " ");
			}
			System.out.println();
		}

	}

	static int[] shuffle() {

		// 1. 洗牌
		int count = 52;
		int[] poker = new int[count];
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			do {
				temp = (int) (Math.random() * count);

				// 檢查機制
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);

			poker[i] = temp;
			System.out.println(poker[i]);
		}
		System.out.println("--------");

		return poker;
	}

//	static void ReverseArray(int[] validData) {
//		for(int i = 0; i < validData.length / 2; i++){
//		    int temp = validData[i];
//		    validData[i] = validData[validData.length - i - 1];
//		    validData[validData.length - i - 1] = temp;
//		}
//	}
	static int[] pairSort(int[] mycards) {
		int[] temp = new int[mycards.length];
		int counter=0;
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < mycards.length; j++) {
				if(mycards[j]%13==i) {
					temp[counter]= mycards[j];
					counter++;
				}
			}
		}
		return temp;
	}

}
