public class Rotor {

    private String rotorValues;
    private char startChar;

    public Rotor(String v, char c) {
        this.rotorValues = new String(v);
        this.startChar = c;


        char node;

    }

    public boolean rotate() {
        // TODO

        char node = rotorValues.charAt(0);



        if (node == startChar) {
            return true;
        }
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