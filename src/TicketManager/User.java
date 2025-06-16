package TicketManager;

import java.util.ArrayList;
import java.util.List;

public class User {
	int U_id;
	String U_name;
	String U_mobile;
	List<Events> bookedEvent=new ArrayList<Events>();

	User(int U_id,String name,String mobile){
		this.U_id=U_id;
		this.U_name=name;
		this.U_mobile=mobile;
	}
}
