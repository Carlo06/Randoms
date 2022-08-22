public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am" +  name );      

    }
    
    public void sayMyStrength(){
        System.out.println("my strength is" +  strength );


    }

    public void sayMyAgility(){
        System.out.println("my agility is" +  agility );



    }

    public void sayMyIntelligence(){
        System.out.println("my intelligence is" +  intelligence );


    }

//public Character(int strength, int agility, int intelligence, String name){

        strength = this.strength;
        agility = this.agility;
        intelligence = this.intelligence;
        name = this.name;


}
