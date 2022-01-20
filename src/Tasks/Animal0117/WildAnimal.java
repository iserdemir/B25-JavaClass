package Tasks.Animal0117;

public class WildAnimal extends Animal{
    public boolean isWild;
    public boolean isFriendly;
    public boolean isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
    public void hunt(){
        if (isWild){
            System.out.println(getName() + " is hunting!");
        }
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */