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
public class A1 {

    // Attributes
    public int AVar1;
    private int AVar2;
    protected String AVar3;

    // Constructor
    public A1() {

    }

    // Methods
    public int getSumVar1Var2() {
        return AVar1 + AVar2;
    }

    // Getters & Setters
    public int getAVar1() {
        return AVar1;
    }

    public void setAVar1(int AVar1) {
        this.AVar1 = AVar1;
    }

    public int getAVar2() {
        return AVar2;
    }

    public void setAVar2(int AVar2) {
        this.AVar2 = AVar2;
    }

    public String getAVar3() {
        return AVar3;
    }

    public void setAVar3(String AVar3) {
        this.AVar3 = AVar3;
    }

}
