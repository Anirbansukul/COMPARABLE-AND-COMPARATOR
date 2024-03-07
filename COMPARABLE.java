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
public class COMPARABLE {

	public static void main(String[] args) {
		ArrayList<Laptop> a=new ArrayList<Laptop>();
		a.add(new Laptop("HP I3 11 GEN",42000.76f,2022));
		a.add(new Laptop("HP I5 11 GEN",52000.96f,2020));
		a.add(new Laptop("HP PAVILION 11 GEN",67000.90f,2023));
		a.add(new Laptop("HP PAVILION 12 GEN",79000.76f,2024));
		a.add(new Laptop("HP I3 10 GEN",32000.65f,2021));
		Collections.sort(a);
		for(Laptop ani:a) {
			System.out.print(ani.getName()+" "+ani.getPrice()+" "+ani.getYear()+"\n");
		}
	}

}
