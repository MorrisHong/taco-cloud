package kr.gracelove.tacocloud.tacos.data;

import kr.gracelove.tacocloud.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GraceLove on 2020/05/19.
 * Contact : govlmo91@gmail.com
 */
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
