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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuackBehavior quackBehavior = new Quack();
        FlyBehavior flyBehavior = new FlyWithWings();
        SwimBehavior swimBehavior = new Swim();
        Duck duck = new MallardDuck(quackBehavior,flyBehavior,swimBehavior);
        duck.display();
        duck.performFly();
        duck.performSwim();
        duck.performQuack();
//        QuackBehavior quackBehavior1 = new Squeak();
//        FlyBehavior flyBehavior1 = new FlyNoWay();
//        SwimBehavior swimBehavior1 = new Float();
//        Duck duck1 = new RubberDuck(quackBehavior1,flyBehavior1,swimBehavior1);
//        duck1.display();
//        duck1.performFly();
//        duck1.performSwim();
//        duck1.performQuack();
//        
    }
    
}
