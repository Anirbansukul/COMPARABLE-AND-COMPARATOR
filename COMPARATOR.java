
import java.lang.*;
import java.util.*;
class Laptop implements Comparable<Laptop>{
	String name;
	float price;
	int year;
	public Laptop(String n,float p,int y) {
		this.name=n;
		this.price=p;
		this.year=y;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public int getYear() {
		return year;
	}
	public int compareTo(Laptop l) {
		return this.year - l.year;
	}
}
class COMN implements Comparator<Laptop>{

	@Override
	public int compare(Laptop l1, Laptop l2) {
		return l1.name.compareTo(l2.name);
	}
}
class COMP implements Comparator<Laptop>{
	public int compare(Laptop l1,Laptop l2) {
		if(l1.price==l2.price) {
			return 0;
		}
		else if(l1.price>l2.price) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class COMPARATOR {

	public static void main(String[] args) {
		ArrayList<Laptop> a=new ArrayList<Laptop>();
		a.add(new Laptop("HP I3 11 GEN",42000.76f,2022));
		a.add(new Laptop("HP I5 11 GEN",52000.96f,2020));
		a.add(new Laptop("HP PAVILION 11 GEN",67000.90f,2023));
		a.add(new Laptop("HP PAVILION 12 GEN",79000.76f,2024));
		a.add(new Laptop("HP I3 10 GEN",32000.65f,2021));
		Collections.sort(a);
		for(Laptop nob:a) {
			System.out.print(nob.getName()+" "+nob.getPrice()+" "+nob.getYear()+"\n");
		}
System.out.println("------------------------------------------------------------------------");
COMN ob1=new COMN();
Collections.sort(a,ob1);
for(Laptop nob:a) {
	System.out.print(nob.getName()+" "+nob.getPrice()+" "+nob.getYear()+"\n");
}
System.out.println("------------------------------------------------------------------------");
COMP ob2=new COMP();
Collections.sort(a,ob2);
for(Laptop nob:a) {
	System.out.print(nob.getName()+" "+nob.getPrice()+" "+nob.getYear()+"\n");
}
	}

}

