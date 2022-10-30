public class Main {
    public static void main(String[] args) {
        int[] list = {1, 6,81,62,31,20};
        int sum = 0;

        for(int i = 0; i < list.length; i++){
            sum += 1/ list[i];


        }
        sum = list.length/sum;
        System.out.println(sum);

    }
}
