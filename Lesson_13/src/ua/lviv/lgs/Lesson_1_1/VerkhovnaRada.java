package ua.lviv.lgs.Lesson_1_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public final class VerkhovnaRada {
	
	private List<Fraction> verkhovna_rada = new ArrayList<Fraction>();
	private static VerkhovnaRada _instance = null;
	
	private static final VerkhovnaRada INSTANCE = new VerkhovnaRada();
	
	private VerkhovnaRada() {
		super();
	}

	  public static VerkhovnaRada getInstance() {
	        if (_instance == null)
	            _instance = new VerkhovnaRada();
	        return _instance;
	    }
	
	public void addFraction(){
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		verkhovna_rada.add(new Fraction(name));
		System.out.println("Фракція "+name+" додана");
	}
	
	public void deleteFraction(){
		System.out.println("Введіть назву фракції для видалення");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();		
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getName().matches(name)){
				iterator.remove();
				System.out.println("Фракція "+name+" видалена");
			}
		}
	}
	
	
public void getAllFractions(){
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
	}
	
	
	public void getFraction(){
		System.out.println("Введіть назву фракції");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println(fraction.getName());
				fraction.getAllDeputies();
			}			
		}
		if (!find) {
			System.out.println("Такої фракції немає"+name);
		}		
	}
	
	public void addDeputy(){
		System.out.println("Введіть фракцію");		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();				
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				fraction.addDeputy();				
			}			
		}
		if (!find) {
			System.out.println("Такої фракції немає"+name);
		}
	}
	
	
	public void deleteDeputy(){
		System.out.println("Введіть фракцію");	
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				
				fraction.deleteDeputy();
			}			
		}
		if (!find) {
			System.out.println("Такої фракції немає"+name);
		}
	}
	
	
	public void getCorruptionist(){
		System.out.println("Введіть назву фракції");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("список хабарників у фракції "+fraction.getName());
				fraction.getCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("Такої фракції немає"+name);
		}		
	}
	
	
	
	public void getMostCorruptionist(){
		System.out.println("Введіть назву фракції");	
		Scanner sc = new Scanner(System.in);
		String name = sc.next();			
		Iterator<Fraction> iterator = verkhovna_rada.iterator();
		boolean find = false;
		while (iterator.hasNext()) {
			Fraction fraction = iterator.next();
			if (fraction.getName().matches(name)){
				find = true;
				System.out.println("Найбільший хабарник фракції "+fraction.getName());
				fraction.getMostCorruptionist();
			}			
		}
		if (!find) {
			System.out.println("Такої фракції немає"+name);
		}		
	}
	
	
	
}
