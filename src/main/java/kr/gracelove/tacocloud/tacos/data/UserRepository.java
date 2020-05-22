package kr.gracelove.tacocloud.tacos.data;

import kr.gracelove.tacocloud.tacos.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
