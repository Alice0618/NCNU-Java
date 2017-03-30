public class TestAnimal {
	public static void pushAllAnimal(Animal_1[] list) {
		for(int i = 0; i < list.length; i++) {
			list[i].move();
		}
	}
	public static void main(String[] argv) {
		/*
		Animal a = new Animal();
		// refrence of parent's type can point to class object
		// polymorphism(多型)
		Animal b = new Dog();
		// if the method actually called is determined by
		// (1) refrence type: non-virtual function
		// (2) object type: virtual function; by java
		a.move;
		b.move;
		b = new FlyDog();
		b.move;
		*/
		Animal_1[] l = new Animal_1[] {new FlyDog(), new Dog(), new Animal_1(), new OldFish(), new OldFish()};
		pushAllAnimal(l);
	}
}
