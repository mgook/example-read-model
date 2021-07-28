public class Application {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        System.out.println(orderRepository.findOrder());
    }
}
