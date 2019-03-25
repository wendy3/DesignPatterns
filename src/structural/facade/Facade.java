package structural.facade;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class Facade {

    private SubClassOne classOne;
    private SubClassTwo classTwo;
    private SubClassThree classThree;

    public Facade() {
        classOne = new SubClassOne();
        classTwo = new SubClassTwo();
        classThree = new SubClassThree();
    }

    public void method() {
        classOne.method();
        classTwo.method();
        classThree.method();
    }
}
