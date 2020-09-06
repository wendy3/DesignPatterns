package behavioral.interpreter;

/**
 * @author gww
 * @date 2020/09/06
 */
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
