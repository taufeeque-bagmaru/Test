public class MainService {
    private UserService userService;
    private OrderService orderService;
    
    public MainService() {
        this.userService = new UserService();
        this.orderService = new OrderService();
    }
    
    public void doSomething() {
        // Call methods from UserService and OrderService
        userService.createUser("John");
        orderService.createOrder("12345");
    }
    
    public static void main(String[] args) {
        MainService mainService = new MainService();
        mainService.doSomething();
    }
}

