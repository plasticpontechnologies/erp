package com.plasticon.erp.service;

import java.util.ArrayList;
import java.util.List;

import com.plasticon.erp.model.UserDetails;

public class ServiceStubbing {
	static UserDetails obj;
	static UserDetails obj2;

	static {
		ArrayList<UserDetails> objUserDetails = new ArrayList<UserDetails>();
		obj = new UserDetails();
		obj2 = new UserDetails();
		obj.setUserId(111);
		obj.setUserName("admin");
		obj.setUserPassword("admin");
		obj.setUserActive("Y");
		obj.setUserType("A");

		obj2.setUserId(112);
		obj2.setUserName("staff");
		obj2.setUserPassword("staff");
		obj2.setUserActive("Y");
		obj2.setUserType("A");

	}

	public static List<com.plasticon.erp.model.UserDetails> getUserLlist() {
		ArrayList<UserDetails> objUserDetails = new ArrayList<UserDetails>();
		UserDetails obj = new UserDetails();
		UserDetails obj2 = new UserDetails();
		objUserDetails.add(obj);
		objUserDetails.add(obj2);

		return objUserDetails;
	}

	public static ArrayList<com.plasticon.erp.model.UserDetails> UserDetails(String usr, String pwd) {

		if (("admin".equals(usr) && "admin".equals(pwd)) || ("user".equals(usr) && "user".equals(pwd))
				|| ("staff".equals(usr) && "staff".equals(pwd))) {
			ArrayList<UserDetails> objUserDetails = new ArrayList<UserDetails>();
			/*
			 * UserDetails obj = new UserDetails(); UserDetails obj2 = new UserDetails();
			 */
			objUserDetails.add(obj);
			objUserDetails.add(obj2);
			return objUserDetails;
		} else {
			return null;
		}
		// return false;
	}
}
