package day42_Exceptions;

class FadyExceptions extends RuntimeException{
    public FadyExceptions(){
        super("Time for a short break");
    }
    public FadyExceptions(String message){
        super(message);
    }
}
class NoBreakExceptions extends Exception{

}

public class CustomExceptions {
    public static void main(String[] args) {
try {
    //throw new NoBreakExceptions();
    throw new FadyExceptions();
} catch (FadyExceptions e){
    e.printStackTrace();
}
    }
}
