/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckversion5solution;

/**
 *
 * @author Sanuth
 */
public abstract class Duck {
    
    
    public abstract void display();
    public abstract void performFly();
    public abstract void performQuack();
    public abstract void performSwim();
    public abstract void setFlyBehavior(FlyBehavior flyBehavior);
    public abstract void setQuackBehavior(QuackBehavior quackBehavior);
    public abstract void setSwimBehavior(SwimBehavior swimBehavior);
}
