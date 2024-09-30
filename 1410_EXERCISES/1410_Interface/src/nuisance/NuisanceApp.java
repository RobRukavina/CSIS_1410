package nuisance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NuisanceApp {
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("Juan", 27, Hobby.MUSIC),
				new Friend("Kate", 27, Hobby.SPORTS),
				new Friend("Alex", 21, Hobby.MUSIC)
		};
		
		System.out.println("3 Friends: ");
		
		int idx = 0;
		for(Friend f : friends) {
			System.out.println("friend" + (idx + 1) + ": " + f.toString());
			idx++;
		}
		
		System.out.println();
		
		Friend newFriend = new Friend("Kate", 27, Hobby.SPORTS);
		
//		System.out.println(newFriend.play(friends));
		
		System.out.println("friend1 equals friend2: " + friends[0].equals(friends[1]));
		System.out.println("friend1 equals friend3: " + friends[0].equals(friends[2]));
		System.out.println("friend2 equals new friend: " + friends[1].equals(newFriend));
		System.out.println();
		
		Telemarketer fritz = new Telemarketer("Fritz", 25);
		
		System.out.println("telemarketer: " + fritz.toString());
		System.out.println();
		
		Mosquito m = new Mosquito("Aedes vexans");
		PeskyMosquito pm = new PeskyMosquito("Anopheles walkeri");
		
		List<String> c = new ArrayList<>();
		Collections.addAll(c, "yellow", "black", "blue");
		Butterfly b = new Butterfly("Swallowtail", c);
		Butterfly cB = new Butterfly(b);
		
		Insect[] insects = {m, pm, b, cB};
		
		System.out.println("4 Insects: ");
		
		for(Insect i : insects) {
			System.out.println(i.toString());
		}
		System.out.println();
		
		Nuisance[] n = { fritz, m, pm };
		
		for(Nuisance curr : n) {
			if(curr instanceof Mosquito) {
				System.out.println(((Mosquito) curr).buzz());
			}
			
			if(curr instanceof PeskyMosquito) {
				System.out.println(((PeskyMosquito) curr).bite());
			}
			System.out.println(curr.annoy());
			System.out.println();
		}
	}
}
