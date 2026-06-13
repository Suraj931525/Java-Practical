public class  removeduplicaterrayelement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}