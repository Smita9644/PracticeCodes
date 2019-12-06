package AssinmentTwo;

import java.util.HashSet;
/** The given below is the class in which we create a set and adding Fruit in it*/
public class SetOfFruit {

	public static void main(String[] args) {
         /** Here we create a hashSet which contain Fruit*/
		HashSet<Fruit> Fruitset = new HashSet<Fruit>();
		Fruitset.add(new Fruit("Apple", "red", 10));
		Fruitset.add(new Fruit("guava", "green", 10));
		Fruitset.add(new Fruit("pineapple", "brown", 20));
		Fruitset.add(new Fruit("Apple", "red", 10));
		System.out.println("Element in FruitSet are ::"+Fruitset.size());

	}
}
