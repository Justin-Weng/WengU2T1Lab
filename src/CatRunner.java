public class CatRunner {
    public static void main(String[] arg) {
        Cat cat1 = new Cat("cat1", 999, 1.1);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Bob", 1, 3.123);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
