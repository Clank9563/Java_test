package tw.org.iii.tutor;

import tw.org.iii.myclasses.BCrypt;

public class Jay75 {
	//檢查
	public static void main(String[]args) {
		String passwd = "123456";
		String hwPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hwPasswd);
		
		if (BCrypt.checkpw("123457", "$2a$10$VkqPUE/S7thKNeP3oga1yOcdmsL.P5C0OAi5TJjtWFNarNVflxqAi")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
