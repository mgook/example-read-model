import java.util.Random;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public String findOrder() {
        return "ORDER" + new Random().nextInt(100000);
    }
}
