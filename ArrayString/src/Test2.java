public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5};
        int[] newArray = method(array);
    }

    public static int[] method(int[] array) {
        int[] tempArray = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean bool = false;

            for (int j = 0; j < count; j++) {
                if (array[i] == tempArray[j]) {
                    bool = true;
                    break;
                }
            }

            if (!bool) { // false면 실행
                tempArray[count] = array[i];
                count++;
            }
        }
        int[] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }
}
