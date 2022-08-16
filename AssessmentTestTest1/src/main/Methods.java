
public class Methods {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobo", 4);
        System.out.println(dog.getName());

        System.out.println(dog.bark("vov", 3,true));
        System.out.println(dog.description());
        System.out.println(dog.description(true));

}
    public static int addThree(int n) {
        return n + 3; // change this method!
    }

}
