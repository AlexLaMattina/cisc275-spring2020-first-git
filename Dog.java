import java.util*;
public class Dog implements Comparable<Dog>{
	public Dog(String name,int legs){
		this.name=name;
		this.legs=legs;
	}
	public String toString(){
		return name +":"+ legs;
	}
}
			
