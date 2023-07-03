public class StringOperation {
    public static void main(String[] args) {
        String a[] = { "Khushi", "Saini", "Riya", "Khushboo", "Khushi Saini" };
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > maxLength) {
                maxLength = a[i].length();
                maxIndex = i;
            }
        }
        System.out.println("The longest String is: " + a[maxIndex]);
    }
}
