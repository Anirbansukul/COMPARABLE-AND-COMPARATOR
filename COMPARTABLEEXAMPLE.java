package CLASSESOBJECT;
import java.lang.*;
import java.util.*;
class Movie implements Comparable<Movie>{
String mN;
int rD;
double rT;
public Movie(String mN,int rD,double rT){
	this.mN=mN;
	this.rD=rD;
	this.rT=rT;
}
public String getMName() {
	return mN;
}
public double getMRating() {
	return rT;
}
public int getMRDate() {
	return rD;
}

public int compareTo(Movie m) {
	return this.rD - m.rD;
}
//public int compare(Movie m1,Movie m2) {
//	return m1.mN.compareTo(m2.mN);
//}
//public int compare(Movie m1,Movie m2) {
//	if(m1.rT==m2.rT) {
//		return 0;
//	}
//	else if(m1.rT>m2.rT) {
//		return 1;
//	}
//	else {
//		return -1;
//	}
//}
}
public class COMPARTABLEEXAMPLE {

	public static void main(String[] args) {
		ArrayList<Movie> as=new ArrayList<Movie>();
		as.add(new Movie("AS",12,9.5));
		as.add(new Movie("AS1",15,9));
		as.add(new Movie("AS2",14,9.9));
		as.add(new Movie("AS3",16,10));
		Collections.sort(as);
		for(Movie movie:as) {
			System.out.print(movie.getMRDate()+" "+movie.getMName()+" "+movie.getMRating()+"\n");
		}

	}

}
