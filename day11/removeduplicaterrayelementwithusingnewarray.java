public class removeduplicaterrayelementwithusingnewarray {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,4,5,5,6,6,7,8,8,9};
        int arr2[] = new int[arr.length];
        int count;

        for (int i = 0; i < arr.length; i++) {

            count = 0;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 0) {
                arr2[i] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}