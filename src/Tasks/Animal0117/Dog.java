package Tasks.Animal0117;

    public class Dog extends FriendlyAnimal{
        public Dog(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color, false, true, true);
        }
        public void bark(){
            System.out.println(getName() + " is barking!");
        }
        public void eat(){
            System.out.println(getName() + " is eating a dog food.");
        }
    }
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */

