package ua.lviv.lgs.Lesson_1_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	
	private String name;

	public Fraction(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Deputy> fraction = new ArrayList<Deputy>();

	
	public void addDeputy() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input lastName Deputy");
		String lastName = sc.next();	
		System.out.println("Input firstName Deputy");
		String firstName = sc.next();	
		
		System.out.println("Input weight");
		Integer weight = sc.nextInt();
		System.out.println("Input height");
		Integer height = sc.nextInt();	
		
		System.out.println("Input age");
		Integer age = sc.nextInt();		
		System.out.println("He takes bribes (false/true)");
		Boolean corrupt = sc.nextBoolean();
		fraction.add(new Deputy(weight,height,lastName,firstName,age,corrupt));
		fraction.get(fraction.size()-1).giveBribe();
		System.out.println("Fraction "+fraction.get(fraction.size()-1).toString());
	}
	
	public void deleteDeputy(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input  last mane  for delete ");
		String lastName = sc.next();	
		boolean find = false;
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getLastName().matches(lastName)) {
				iterator.remove();
				find=true;
			}
		}
		if (!find) System.out.println("Такого Депутата "+lastName+" Немає");
	}
	
	public void getCorruptionist() {
		Iterator<Deputy> iterator = fraction.iterator();
		
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.isCorruptionist()) {
				System.out.println(deputyIterator.toString());
			}
		}
	}
	
	
	public void getMostCorruptionist() {
		Iterator<Deputy> iterator = fraction.iterator();
		int maxBribe = 0;
		Deputy deputy = null;
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getSizeOfBribe()>maxBribe) {
				maxBribe=deputyIterator.getSizeOfBribe();
				deputy = deputyIterator;
			}
		}
		System.out.println("! Corruptionist ! "+deputy.toString());
	}	
	
	
	public void getAllDeputies() {
		Iterator<Deputy> iterator = fraction.iterator();
		System.out.println("Депутати фаркції");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}	
	
	
	
}
