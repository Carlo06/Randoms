public class Weapon {
    // Property/Attributes
    int damage;
    Float Weight;
    String name;
    String description;
    String rarity;
    boolean hasElementalDamage;
    
    // method
    public void showDescription(){
        System.out.println("Description: " + description);
    }

    public void showDamage(){
        System.out.println("damage "+ damage);
    }


}
