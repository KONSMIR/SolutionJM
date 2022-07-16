package task_2_3_10;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        String st1;
        String st2;

        String st = text.replaceAll("[^a-zA-Z0-9]", "");

        if (st.length() <= 1){
            return true;
        }

        if (st.length() % 2 == 0) {
            st1 = st.substring(0, st.length() / 2);
            st2 = st.substring(st.length() / 2);
        } else {
            st1 = st.substring(0, st.length() / 2);
            st2 = st.substring(st.length() / 2 + 1);
        }

        char[] arr = new char[st2.length()];
        char[] arrSt2 = st2.toCharArray();

        for (int i = 0; i < arrSt2.length; i++) {
            arr[arrSt2.length - i - 1] = arrSt2[i];
        }

        st2 = new String(arr);

        return st1.equalsIgnoreCase(st2);
    }
}
