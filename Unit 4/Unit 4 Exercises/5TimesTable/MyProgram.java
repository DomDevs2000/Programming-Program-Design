
public class MyProgram {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            int multipleOf5 = i * 5;
            if (i != 5) {
                if (multipleOf5 <= 50) {
                    System.out.println(multipleOf5);
                }
            }
        }
    }
}
