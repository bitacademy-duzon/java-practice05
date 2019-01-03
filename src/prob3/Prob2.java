package prob3;

public class Prob2 {
	public static void main(String[] args) {
		Bird bird01 = new Duck();
		bird01.setName( "꽥꽥이" );
		bird01.fly();
		bird01.sing();
		System.out.println( bird01 );
		
		Bird bird02 = new Sparrow();
		bird02.setName( "짹짹이" );
		bird02.fly();
		bird02.sing();
		System.out.println( bird02 );
	}
}

abstract class Bird{
	
	protected String name;
	protected String type;

	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bird(String type) {
		super();
		this.type = type;
	}

	
	abstract void fly();
	abstract void sing();
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return type + " 의 이름은 " + name +" 입니다.";
	}
	
	
	
	
	
}

class Duck extends Bird{

	public Duck() {
		super("오리");
	}

	@Override
	void fly() {
		System.out.println(super.type + "(" + super.name + ")은 날지 않습니다.");		
	}

	@Override
	void sing() {
		System.out.println(super.type + "(" + super.name + ")가 소리내어 웁니다.");		
		
	}

	
	
}

class Sparrow extends Bird{

	
	
	public Sparrow() {
		super("참새");
	}

	@Override
	void fly() {
		System.out.println(super.type + "(" + super.name + ")은 날아다닙니다.");				
	}

	@Override
	void sing() {
		System.out.println(super.type + "(" + super.name + ")은 소리내어 웁니다.");				
		
	}
	
	
	
	
}
