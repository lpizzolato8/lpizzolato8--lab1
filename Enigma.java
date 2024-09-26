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
    }


    
    public String encrypt(String message){
        //TODO

        // find the character on the outermost rotor and get index. -- rotor3.indexof(a)
        // find the chartacter on the innermost rotor using the index -- rotor1.charAt(rotor3.indexof(a))
        // find the character on the middle rotor and get the index -- rotor2.indexof(^^)d
        // find the character on the outermost rotor using index -- rotor3.charAt(^^^)
        // Rotate rotor3
        // if same value then middle rotates -- if rotate = true, rotat middle

        if(rotors[0].rotate()){
            rotors[2].rotate();
        }
        
        for(int i = 0; i < message.length(); i++){
            rotors[3].indexOf(message.charAt(i));
        rotors[1].charAt();
        rotors[2].indexOf();
        rotors[3].charAt();

        }

        rotors[3].indexOf();
        rotors[1].charAt();
        rotors[2].indexOf();
        rotors[3].charAt();

        rotors[3].rotate();




    }
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    } 
}