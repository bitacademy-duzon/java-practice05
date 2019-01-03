package prob4;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	private static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}
}

class Cat implements Soundable{	
	
	
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
	
	
	
}

class Dog implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
	
	
}

class Sparrow implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "짹짹";
	}
	
	
	
}

class Duck implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "꽥꽥";
	}
	
	
	
}