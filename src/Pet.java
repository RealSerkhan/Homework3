public class Pet {
    String nickname;
    int age;
    int trickLevel;
    int[] habits;
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("hello,owner.i am "+nickname+". I miss you");
    }
    public void foul(){
        System.out.println("i need to cover it up");
    }
}
