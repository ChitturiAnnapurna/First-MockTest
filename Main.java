package mocktest.animal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		List<Duck>duckList = new ArrayList<>();
		List<Fish>fishList = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(".\\ducks.txt"))) {
			while((str = br.readLine())!=null) {
				String[] duckAttributes = str.split(",");
				if(duckAttributes!=null && duckAttributes.length>=3) {
				Duck duck = new Duck(Integer.parseInt(duckAttributes[0]),duckAttributes[1],duckAttributes[2]);	
				duckList.add(duck);
				}
			}
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(".\fishes.txt"))) {
			while((str = br.readLine())!=null) {
				String[] fishAttributes = str.split(",");
				if(fishAttributes!=null && fishAttributes.length>=4) {
				Fish fish = new Fish(Integer.parseInt(fishAttributes[0]),fishAttributes[1],Integer.parseInt(fishAttributes[2]),Boolean.valueOf(fishAttributes[3]));
				fishList.add(fish);
				}
			}
		}
		
		System.out.println("Before Sorting");
		
		for(Fish fish: fishList) System.out.println(fish);
		
		Collections.sort(fishList);
		
		System.out.println("After Sorting Fishes");
		
		for(Fish fish: fishList) System.out.println(fish);
		
		System.out.println("After Sorting fishes in descending order");
		
		Collections.sort(fishList,(o1,o2)->o1.getSizeInFt()<o2.getSizeInFt()?1:-1);
		
		for(Fish fish : fishList) System.out.println(fish);
		
		System.out.println("print Ducks");
		
		for(Duck duck:duckList) System.out.println(duck);
		
		//duckList = duckList.stream().filter(duck->duck.beakColor.equalsIgnoreCase("brown")).sorted(d1,d2)
		
		
			 
	   
	}
}


