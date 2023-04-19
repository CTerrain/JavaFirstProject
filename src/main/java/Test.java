public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 = d1;

        Dog dog = (Dog)a1;
    }
}
