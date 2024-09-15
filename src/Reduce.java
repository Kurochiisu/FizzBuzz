public class Reduce {

    public static void main(String[] args) {

        int num_steps = 0;
        int num = 100;
        while (num > 0) {
            if (num % 2 == 0) {
                num_steps++;
                num = num / 2;
            }
            else {
                num_steps++;
                num--;
            }
        }
        System.out.println(num_steps);
    }




}
