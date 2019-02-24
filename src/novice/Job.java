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
public class Job extends Novice  {
    public String tank;
    public String attack;

    public Job(int inputValue) {
        super(inputValue);
    }
    
     public void setTank(String tank){
        this.tank = tank;
    }
   
    public void setAttack(String attack){
        this.attack = attack;
    }
    public void showTank(){
        //System.out.println(""+ tank);
        System.out.println("Job of Novice is Swordman");
        
    }
    
    public void showAttack(){
        //System.out.println(""+ attack);
        System.out.println("Job of Novice is Archer or Merchant");
    }
   public void showJob(){
       System.out.println("No. 1) : Tank");
       System.out.println("No. 3) : Attack");
   }
    
}
