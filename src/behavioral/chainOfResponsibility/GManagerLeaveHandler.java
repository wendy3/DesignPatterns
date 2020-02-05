package behavioral.chainOfResponsibility;

public class GManagerLeaveHandler extends AbstractLeaveHandler {

    public GManagerLeaveHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() >=this.MIDDLE && request.getLeaveDays() <= this.MAX) {
            System.out.println("总经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}
