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
public class MallardDuck extends Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;
    private SwimBehavior swimBehavior;

    MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior,SwimBehavior swimBehavior) {
        this.setQuackBehavior(quackBehavior); 
        this.setFlyBehavior(flyBehavior);
        this.setSwimBehavior(swimBehavior);
    }

    @Override
    public final void display() {
        System.out.println("I'm a Mallard Duck");
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }

    @Override
    public final void performSwim() {
        swimBehavior.swim();
    }

    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        if(flyBehavior == null){
            throw new IllegalArgumentException("Object can't be null");
        }
      this.flyBehavior =  flyBehavior;
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
         if(quackBehavior == null){
            throw new IllegalArgumentException("Object can't be null");
        }
         this.quackBehavior = quackBehavior;
    }

    @Override
    public final void setSwimBehavior(SwimBehavior swimBehavior) {
         if(swimBehavior == null){
            throw new IllegalArgumentException("Object can't be null");
        }
         this.swimBehavior = swimBehavior;
    }
}
