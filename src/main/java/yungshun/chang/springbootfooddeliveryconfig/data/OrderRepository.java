package yungshun.chang.springbootfooddeliveryconfig.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliveryconfig.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
