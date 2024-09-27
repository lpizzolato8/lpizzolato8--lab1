public class Rotor {

    private String rotorValues;
    private char startChar;

    public Rotor(String v, char c) {
        this.rotorValues = new String(v);
        this.startChar = c;
        String copy = "";

        while (rotorValues.charAt(0) != startChar) {
            rotate();
        }

    }

    public boolean rotate() {
        // TODO
        char lastChar = rotorValues.charAt(rotorValues.length() - 1);
        if (lastChar == startChar) {
            String firstHalf = rotorValues.substring(0, rotorValues.length() - 1);
            rotorValues = lastChar + firstHalf;
            return true;
        }
        String firstHalf = rotorValues.substring(0, rotorValues.length() - 1);
        rotorValues = lastChar + firstHalf;
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