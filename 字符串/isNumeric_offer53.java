public class isNumeric_offer53 {

    private int index = 0;
    public boolean isNumeric(char[] str) {
        if (str.length < 1) {
            return false;
        }
        boolean flag = scanInteger(str);
        if (index < str.length && str[index] == '.' ) {
            index++;
            flag = scanUnsignedInteger(str) || flag;
            //flag = flag || scanUnsignedInteger(str); 由于逻辑运算符的短路性质导致出错
            //例如"123.45e+6"时，由于flag为true，不会执行scanUnsignedInteger(str)，指针不移动
        }
        if (index < str.length && (str[index] == 'E' || str[index] == 'e')) {
            index++;
            flag = flag && scanInteger(str);
        }
        return flag && index == str.length;

    }

    private boolean scanInteger(char[] str) {
        if (index < str.length && (str[index] == '+' || str[index] == '-')) {
            index++;
        }
        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str) {
        int start = index;
        while (index < str.length && (str[index] >= '0' && str[index] <= '9')) {
            index++;
        }
        return start < index;
    }
}
