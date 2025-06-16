package TicketManager;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TicketManager {
	static List<User> usersList =new ArrayList<User>();
	static List<Events> EventList =new ArrayList<Events>();
	static int arr[]= {5,5,5,5,5};
	
	public static void ViewAllUsers() {
		for(User u: usersList) {
			System.out.println(u.U_id+" "+u.U_name+" "+u.U_mobile);
		}
	}
	public static void viewAllEvents() {
		for(Events e: EventList) {
			System.out.println(e.E_id+" "+e.E_name+" "+" "+ e.venue);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		while(true) {
		System.out.println("1.Add User");
		System.out.println("2. View All User");
		System.out.println("3. Add Events");
		System.out.println("4. View All Events");
		System.out.println("5. Book Event");
		System.out.println("6. Show booked Events");
		System.out.println("7. Exit");
		System.out.println("Enter Your Choice");
		int ch=scanner.nextInt();
		switch(ch) {
		case 1:
			
			System.out.println("Enter your id");
			int id=scanner.nextInt();
			System.out.println("Enter your name");
			String name =scanner.next();
			System.out.println("Enter your mobile number");
			String mobile=scanner.next();
			
			User user=new User(id,name,mobile);
			usersList.add(user);
			
//			User user2=new User(1,"Dora","123456789");
//			usersList.add(user2);
//			User user3=new User(2,"Bujji","234567890");
//			usersList.add(user3);
//			User user4=new User(3,"Tom","345678901");
//			usersList.add(user4);
//			User user5=new User(4,"Jerry","456789012");
//			usersList.add(user5);
		    break;
		case 2:
			ViewAllUsers();
			break;
		case 3:
			System.out.println("Enter Event id");
			int Eid=scanner.nextInt();
			System.out.println("Enter Event name");
			String Ename =scanner.next();
			System.out.println("Enter Event Venue");
			String Evenue=scanner.next();
			
			Events events=new Events(Eid, Ename, Evenue);
			EventList.add(events);
			
//			Events events2=new Events(1,"Project Expo", "Chennai");
//			EventList.add(events2);
//			Events events3=new Events(2,"Symposium", "Madurai");
//			EventList.add(events3);
//			Events events4=new Events(3,"Culturals", "Chengalpattu");
//			EventList.add(events4);
//			Events events5=new Events(4,"College day", "Trichy");
//			EventList.add(events5);
//			Events events6=new Events(5,"Tech Event", "Cuddalore");
//			EventList.add(events6);
		    break;
		case 4:
			viewAllEvents();
			break;
		case 5:
			
			System.out.println("Enter your user id");
			int userbookid=scanner.nextInt();
			System.out.println("Enter event to book");
			int evebookid=scanner.nextInt();
			Events event=EventList.get(evebookid);
			
			
			if(!(arr[evebookid]==0)) {
				
				arr[evebookid]=arr[evebookid]-1;
				for(User u:usersList) {
					if(u.U_id==userbookid) {
						u.bookedEvent.add(event);
					}
				}
				System.out.println("Booked");		
			}
			else {
				System.out.println("No seats!");
			}
			break;
		case 6:
			System.out.println("Enter the user id");
			int userid=scanner.nextInt();
			for(User u:usersList) {
				if(u.U_id==userid) {
					for(Events e: u.bookedEvent) {
						System.out.println(e.E_id+" "+e.E_name+" "+e.venue);
					}
				}
			}
				
			break;
		case 7:
			scanner.close();
			System.exit(0);			
		}
		
		}
		
		
	}

}

