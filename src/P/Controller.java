/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P;

/**
 *
 * @author santa
 */
public class Controller {
    
    public Controller () 
    {
        
    }
    
    public void testA2B2Association()
    {
        // Init
        A2 aa = new A2();
        aa.AVar1 = 1;
        aa.setAVar2(2);
        aa.AVar3 = "Hello A2";
        
        B2 bb = new B2();
        bb.BVar1 = 11;
        bb.setBVar2(22);
        bb.BVar3 = "Hello B2";
        
        aa.linkb = bb;
        
        // Test
        int figure = aa.getSumB();
        System.out.println("P.Controller.testA2B2Association(): " + figure);
    }
    
    public void testA3B3Association()
    {
        // Init
        A3 aa = new A3();
        B3 bb1 = new B3();
        B3 bb2 = new B3();
        B3 bb3 = new B3();
        
        aa.link.add(bb1);
        aa.link.add(bb2);
        aa.link.add(bb3);
        
        System.out.println("P.Controller.testA3B3Association(): " + aa.link.size());
        
    }
    
    public static void main(String args[]) 
    {
        Controller c1 = new Controller();
        c1.testA2B2Association();
        c1.testA3B3Association();
    }
    
}
