package _12_badgers;

public class Badger {
public static void main(String[] args) {
	String badger = "badger";
	String mushroom = "mushroom";
	String snake = "A snake";
	
	for (int i = 0; i < 3; i++) {
		
	
for (int i1 = 0; i1 < 4; i1++) {

	for (int i11 = 0; i11 < 3; i11++) {
		System.out.println(badger + " " + badger + " " + badger);
	}
	if (i1<3) {
		
	
	//mushroom
		System.out.println(mushroom + " " + mushroom + " " + mushroom);
	}else {
		for (int i11 = 0; i11 < 2; i11++) {
			System.out.println(snake + "  " + snake);
		}
		System.out.println("Snaaake, " + snake);
	}
	}

}
}
}