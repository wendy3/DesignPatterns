package behavioral.templateMethod;

public abstract class AbstractClass {
    public final void templateMethod() {
        // the one step
        this.stepOne();
        // the two step
        this.stepTwo();
        // ...
    }

    private void stepOne() {
        System.out.println("do the step one!");
    }

    protected abstract void stepTwo();
}
