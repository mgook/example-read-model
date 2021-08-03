import com.baemin.order.domain.HistoryTransferRepository;
import com.baemin.order.mongo.OrderReadMongoDao;
import com.baemin.order.rds.OrderReadRdsDao;
import com.baemin.order.read.model.OrderReadDto;
import com.baemin.order.read.service.OrderReadService;

public class Application {
    public static void main(String[] args) {

        OrderReadService orderReadService = new OrderReadService(new OrderReadMongoDao(), new OrderReadRdsDao(), new HistoryTransferRepository());

        for (int i = 0; i < 10; i++) {
            OrderReadDto order = orderReadService.findByOrderNo(String.format("%010d", i));
            System.out.println(order);
        }
    }
}
