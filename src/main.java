public class main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println("main.main");
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0);
    }
}
