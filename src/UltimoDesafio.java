public class UltimoDesafio {
        public static void main(String[] args) {
            String originalString = "Danyel";
            String invertedString = inverterString(originalString);

            System.out.println("String original: " + originalString);
            System.out.println("String invertida: " + invertedString);
        }

        public static String inverterString(String str) {
            char[] chars = str.toCharArray();
            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }

            return new String(chars);
    }
}
