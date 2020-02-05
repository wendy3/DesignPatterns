package behavioral.chainOfResponsibility;

public abstract class AbstractLeaveHandler {
    protected int MIN = 1;
    protected int MIDDLE = 3;
    protected int MAX = 30;

    protected String handlerName;

    // 下一个处理节点
    protected AbstractLeaveHandler nextHandler;

    protected void setNextHandler(AbstractLeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理请假的请求，子类实现
    protected abstract void handlerRequest(LeaveRequest request);
}
