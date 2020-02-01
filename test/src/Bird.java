class Bird extends Animal{
	public String reproduction = "egg";
	public String outerCovering = "feather";
	private String name;
	void move() {
		 System.out.println("Moves by flying.");
     }
	void eat() {
		 System.out.println("Eats birdfood.");
}	 
	// POLYMORPHISM
	public void fly() {
		System.out.println("The bird is flying.");
	}
	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
}

	public void flyUp() {
		System.out.println("Flying up...");
	}
	public void flyDown() {
		System.out.println("Flying down...");
	}
}
//INHERITANCE
class Eagle extends Bird {
	public String name;
	public int lifespan = 15;
	
	//ENCAPSULATION
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

abstract class Animal {
	// abstract methods
	abstract void move();
	abstract void eat();

	// concrete method
	void label() {
		System.out.println(" data:");
}}

class TestEagle {
	public static void main(String[] args) {		
		Eagle myEagle = new Eagle();
		
		myEagle.setName("Eagle");

		System.out.println("Name: " + myEagle.getName()); 			
		System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan); 		
		myEagle.flyUp();
		myEagle.flyDown(); 		
		myEagle.fly();
		myEagle.fly(10000);
		myEagle.fly("eagle", 10000);
	}
}
