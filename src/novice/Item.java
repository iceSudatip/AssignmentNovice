/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

/**
 *
 * @author ACER
 */
public class Item extends ClassBag {
    public int potion;
    public int custom;
    public int weapon;
    public int food;
    public int gard;
    public int butterflyWing;
    
     public Item () {
        super();
        this.gard = 0;
        this.butterflyWing = 0;
    }
    public void addItem2(String select) {
        if("potion".equals(select))
            this.potion++;
        else if("custom".equals(select))
            this.custom++;
        else if("weapon".equals(select))
            this.weapon++;
        else if("food".equals(select))
            this.food++;
        else if("gard".equals(select))
            this.gard++;
        else if("butterflyWing".equals(select))
            this.butterflyWing++;
    }
    public void printItem2(){
        System.out.println("Your gard " + this.gard);
        System.out.println("Your butterflyWing " + this.butterflyWing);
        
    }
}
