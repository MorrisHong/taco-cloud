package kr.gracelove.tacocloud.tacos.data;

import kr.gracelove.tacocloud.tacos.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by GraceLove on 2020/05/19.
 * Contact : govlmo91@gmail.com
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByDeliveryZip(String deliveryZip);
}
