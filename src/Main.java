public class Main {
        public boolean isAnagram(String s, String t) {

            s = s.toLowerCase();
            t = t.toLowerCase();
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            int sAsciiSum = 0;
            int tAsciiSum = 0;

            if (sArray.length != tArray.length) return false;

            for (int i = 0; i < sArray.length; i++) {
                sAsciiSum = sAsciiSum + sArray[i];
                tAsciiSum = tAsciiSum + tArray[i];
            }

            return (sAsciiSum == tAsciiSum);


            //if (sArray.length != tArray.length) return false;

            //int counter = 0;
            //for (int i = 0; i < sArray.length; i++) {
                //for (int ii = 0; ii < sArray.length; ii++) {
                   //if (sArray[i] == tArray[ii]) {
                        //counter += 1;
                        //i++;
                   //}
                //}
            //}
            //if (counter == sArray.length) return true;
            //else return false;
        }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isAnagram("anagram", "gramana"));
    }
}