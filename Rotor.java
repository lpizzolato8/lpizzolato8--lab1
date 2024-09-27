public class Rotor {

    private String rotorValues;
    private char startChar;

    public Rotor(String v, char c) {        
        this.rotorValues = new String(v);
        this.startChar = c;

        String temp = rotorValues.substring(c, c);
        String temp1 = rotorValues.substring(0, startChar-1);
        this.rotorValues = temp + temp1;
    }   

    public boolean rotate() {
        // TODO
        char node = rotorValues.charAt(0);
        String temp = rotorValues.substring(0, rotorValues.length() - 1);
        String temp1 = rotorValues.substring(rotorValues.length()-1, rotorValues.length()-1);
        rotorValues = temp1 + temp;
        
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