public class Rotor {

    private String rotorValues;
    private char startChar;

    public Rotor(String v, char c) {
        this.rotorValues = new String(v);
        this.startChar = c;

        while(!rotate());
    }

    public boolean rotate() {
        // TODO
        
        String temp = new String();
        char node = rotorValues.charAt(0);
        char lastNode = rotorValues.charAt(rotorValues.length() - 1);
        temp = rotorValues.substring(0, rotorValues.length() - 1);
        rotorValues = lastNode + temp;
        
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