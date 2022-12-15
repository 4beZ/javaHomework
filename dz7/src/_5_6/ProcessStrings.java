package _5_6;

public class ProcessStrings implements StringFuncs{
    @Override
    public int numberOfSymbols(String str) {
        int counter = 0;
        for (char ch : str.toCharArray()) {
            counter++;
        }
        return counter;
    }

    @Override
    public String invert(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(str.length() - i - 1);
        }
        return res;
    }

    @Override
    public String somethingWeird(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 == 1)
                res += str.charAt(i);
        }
        return res;
    }
}
