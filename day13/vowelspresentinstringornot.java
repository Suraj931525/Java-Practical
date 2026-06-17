public class vowelspresentinstringornot {

    public static void main(String[] args) {

        String name = "abhijeetpatil";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                count++;
            }
        }

        if (count == 0) {
            System.out.println("Vowels are not present");
        } else {
            System.out.println("Vowels are present");
            System.out.println("Total vowels = " + count);
        }
    }
}