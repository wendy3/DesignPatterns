package behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("LiLi", 20);

        DirectLeaderLeaveHandler handler1 = new DirectLeaderLeaveHandler("直接主管");
        DeptManagerLeaveHandler handler2 = new DeptManagerLeaveHandler("部门经理");
        GManagerLeaveHandler handler3 = new GManagerLeaveHandler("总经理");

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handlerRequest(request);
    }
}
