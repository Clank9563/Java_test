package tw.org.iii.myclasses;

import java.io.Serializable;

public class Student implements Serializable{//Serializable序列化
	//https://blog.csdn.net/weixin_44209555/article/details/107837108
	private String name;
	private int ch, eng;
	private transient int math;//transient不做序列化
	private Bike bike;

	public Student(String name, int ch, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.ch= ch;
		this.math= math;
		bike = new Bike();
	}
	public int sum() {return ch+eng+math;}
	public double avg() {return sum()/3.0;
		
	}

}

