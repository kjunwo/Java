public class Example2 {
    public static void main(String[] args) {
        // 주어진 배열의 평균값을 계산하는 메서드
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(calculateAverage(numbers));
    }

    public static double calculateAverage(int[] arr) {
//        int sum = 0;
//        for (int number : arr){
//            sum += number;
//        }
//        return (int) ((double) sum / arr.length);

        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double)sum / arr.length;
        return average; // 배열의 데이터를 더함(arr[i])

//        int sum = 0;
//        for (int i=0; i<arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        int average = sum / arr.length;
//        return average;
    }
}