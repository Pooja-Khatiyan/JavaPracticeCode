package collectionstopics;

import java.util.HashMap;

public class UserRole {
	public static String getUserCredential(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin;admin@123");
		userMap.put("seller", "seller;seller@123");
		userMap.put("vendor", "vendor;vendor@123");
		userMap.put("manager", "manager;manager@123");
		return userMap.get(role);
	}

	public static void doLogin(String un, String pwd) {
		System.out.println("Login with: " + un + ":" + pwd);
	}

	public static void main(String[] args) {
		String credentialData = getUserCredential("admin");
		System.out.println(credentialData);
		String[] UN = credentialData.split(";");
		String userName = UN[0];
		String passWord = UN[1];
//		String userName = credentialData.split(";")[0];
//		String passWord = credentialData.split(";")[1];
		doLogin(userName, passWord);
	}

}
