package tw.org.iii.tutor;

import java.util.LinkedList;

public class Jay38 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(10);
		System.out.println(list);
		list.add(3);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("-----------------");
//		list.add(0, 0);//前面放插入位置
		list.add(2, 7);//前面放插入位置
		System.out.println(list);
	}

}
