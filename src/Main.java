public class Main {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if (sArray.length != tArray.length) return false;

        int counter = 0;
        for (int i = 0; i < sArray.length; i++) {
            for (int ii = 0; ii < sArray.length; ii++) {
                if (sArray[i] == tArray[ii]) {
                    counter += 1;
                    tArray[ii] = 0;
                    break;
                }
            }
        }
        if (counter == sArray.length) return true;
        else return false;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isAnagram("aacc", "ccac"));
    }
}