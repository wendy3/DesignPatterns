package behavioral.interpreter;

/**
 * @author gww
 * @date 2020/09/06
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
