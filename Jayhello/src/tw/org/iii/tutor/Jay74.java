package tw.org.iii.tutor;

import tw.org.iii.myclasses.BCrypt;

public class Jay74 {

	public static void main(String[] args) {
		//bcrypt
		String password = "123456";
		 String hwPasswd= BCrypt.hashpw(password, BCrypt.gensalt());
		 System.out.println(hwPasswd);
		 
		 if(BCrypt.checkpw("123457", "$2a$10$Iu4Sm4JSyFdlE4V7X/u5OOAv4M37POLMVXcxHi/DVlbyFf2lA5EQG")) {
			 System.out.println("OK");
		 }else {
			 System.out.println("XX");
		 }
	}

}
