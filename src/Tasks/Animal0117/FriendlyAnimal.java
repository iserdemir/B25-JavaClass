package Tasks.Animal0117;

public class FriendlyAnimal extends Animal{
    public boolean isWild;
    public boolean isFriendly;
    public boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
    public void play(){
        if (!isWild){
            System.out.println(getName() + " is playing");
        }else{
            System.out.println(getName() + " can't play!");
        }
    }
    public void pet(){
        if (isFriendly){
            System.out.println(getName() + " is a pet.");
        }else{
            System.out.println(getName() + " isn't a pet.");
        }
    }
}


/*
	2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */