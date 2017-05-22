package duck.test;

import duck.model.Duck;
import duck.model.RedheadDuck;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new RedheadDuck();
		duck.performFly();
		duck.display();
		duck.performQuack();
		duck.swim();

	}
	
	
}
