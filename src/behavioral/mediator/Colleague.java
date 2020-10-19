package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
