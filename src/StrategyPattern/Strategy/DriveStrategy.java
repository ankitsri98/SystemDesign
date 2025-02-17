package StrategyPattern.Strategy;

/*

1. Strategy interface is created for the functionality that is getting duplicated in child classes
Here in this Example it was drive()
Some has special sports capability some has normal.

2. Interface will have a functionality method which all the different capabilities will override and implement.

3. Parent class ( here : Vehicle ) will be interface as a dependency.

4. Parent class will be having a constructor to set the strategy.

5. All the child classes inheriting parent class will be providing the strategy objects.

6. In main we will create Parent class ( here : Vehicle ) object using child classes but strategy is only know to
child classes not main class

 */
public interface DriveStrategy {

    public void drive();
}
