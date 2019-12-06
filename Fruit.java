package AssinmentTwo;

import java.util.*;
/**The Class given below is the fruit class which has three fields name,color and size*/
public class Fruit {
   /**This field indicate name of the Fruit*/
	String name;
	 /**This field indicate color of the Fruit*/
	String color;
	/**This field indicate size of the Fruit*/
	int size;
    /**Parameterized constructor of Fruit class*/
	public Fruit(String name, String color, int size) {

		this.name = name;
		this.color = color;
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result ;
		result=name.hashCode()+name.hashCode()+size;
		return result;
	}
/**here we override the equals method and we check that the two instance of Fruit are equal or not depending upon name,color and size*/
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Fruit other = (Fruit) obj;
		if(this.name==other.name && this.color==other.color && this.size==other.size)
			return true;
		return false;
	}

}
