package tw.org.iii.myclasses;

public class Bike {//預設繼承Object
	protected double speed;// 屬性
//	private私有 public公有 protected保護:只有子類別可以呼叫
	private String color;
	public Bike() {
//		System.out.println("Bike()");
		color = "yellow";
	}
	public String getcolor() {
		return color;
	}
	
	public void upSpeed() {
		// 首字小寫中間大寫
		// 沒有public只能同backag讀取
		speed = speed < 1 ? 1 : speed * 1.2;
	}

	public void downspeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	public double getSpeed() {
		return speed;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bike:"+speed;
		}
}
