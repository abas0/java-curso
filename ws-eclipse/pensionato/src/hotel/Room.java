package hotel;

public class Room {
	private String name[];
	private String email[];
	private int room[];
	
	public Room(String name[], String email[], int room[]) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String name[]) {
		this.name = name;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String email[]) {
		this.email = email;
	}

	public int[] getRoom() {
		return room;
	}

	public void setRoom(int room[]) {
		this.room = room;
	}
	
	public void crescent(int[] room, String[] name, String[] email) {
		int aux = 999;
		String auxName = "";
		String auxEmail = "";
		for(int i = 0; i < room.length; i++) {
			for(int j = 0; j < room.length; j++) {
				if(room[j] > room[i]) {
					aux = room[i];
					room[i] = room[j];
					room[j] = aux;
					auxName = name[i];
					name[i] = name[j];
					name[j] = auxName;
					auxEmail = email[i];
					email[i] = email[j];
					email[j] = auxEmail;
				}
			}
			
		}
		
		for(int i =0; i< room.length; i++) {
			System.out.println(room[i] + ": " + name[i] + ", " + email[i]);
		}
		//System.out.println(rooms);
		//return rooms;
	}
}
