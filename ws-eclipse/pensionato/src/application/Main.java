package application;

import java.util.Scanner;

import hotel.Room;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int size = sc.nextInt();
		String name[] = new String[size];
		String email[] = new String[size];
		int room[] = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Email: ");
			email[i] = sc.next();
			System.out.print("Room: ");
			room[i] = sc.nextInt();
		}
		Room rooms = new Room (name, email, room);
		System.out.println("Busy rooms: ");
		rooms.crescent(room, name, email);
		
		sc.close();	
	}
}
