public class Rotor {

    private String rotorValues;
    private char startChar;
    public Rotor(String v, char c) {
        this.rotorValues = new String(v);
        this.startChar = c;
        String copy = "";

        for (int i = 0; i < rotorValues.length(); i++) {
            if (rotorValues.charAt(i) != this.startChar) {
                copy = copy + rotorValues.charAt(i);
            }
        }
        rotorValues = this.startChar + copy;
    }

    public boolean rotate() {
        // TODO
        char node = rotorValues.charAt(rotorValues.length()-1);
        if (node == startChar) {
            String temp = rotorValues.substring(0, rotorValues.length() - 2);
            String temp1 = rotorValues.substring(rotorValues.length() - 1, rotorValues.length() - 1);
            rotorValues = temp1 + temp;
            return true;
        }
        String temp3 = rotorValues.substring(0, rotorValues.length() - 2);
        String temp4 = rotorValues.substring(rotorValues.length() - 1, rotorValues.length() - 1);
        rotorValues = temp4 + temp3;
        return false;
    }

    public int indexOf(char c) {
        // TODO

        return rotorValues.indexOf(c);
    }

    public char charAt(int idx) {
        // TODO
        return rotorValues.charAt(idx);
    }
}