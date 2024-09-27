public class Enigma{

    private String rotorInit[] = {
        "#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"
    };


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO

        String output = "";

        if(rotors[0].rotate()){
            rotors[2].rotate();
        }

        for(int i = 0; i < message.length() ; i++){
        int rahhh = rotors[2].indexOf(message.charAt(i));
        char rahh = rotors[1].charAt(rahhh); 
        int rah = rotors[0].indexOf(rahh);
        char ra = rotors[2].charAt(rah);
        output = output + ra;
        rotors[2].rotate();
        }

        return output;
    }


    
    public String encrypt(String message){
        //TODO

        // find the character on the outermost rotor and get index. -- rotor3.indexof(a)
        // find the chartacter on the innermost rotor using the index -- rotor1.charAt(rotor3.indexof(a))
        // find the character on the middle rotor and get the index -- rotor2.indexof(^^)d
        // find the character on the outermost rotor using index -- rotor3.charAt(^^^)
        // Rotate rotor
        // if same value then middle rotates -- if rotate = true, rotat middle

        if(rotors[0].rotate()){
            rotors[1].rotate();
        }
        String cypher = "";

        for(int i = 0; i < message.length(); i++){
        int rahhh = rotors[2].indexOf(message.charAt(i));
        char rahh = rotors[0].charAt(rahhh); 
        int rah = rotors[1].indexOf(rahh);
        char ra = rotors[2].charAt(rah);
        cypher = cypher + ra;
        rotors[2].rotate();
        }
        
        return cypher;


    }
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    } 
}