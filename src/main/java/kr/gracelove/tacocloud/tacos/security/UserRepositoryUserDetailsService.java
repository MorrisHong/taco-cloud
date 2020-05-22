package kr.gracelove.tacocloud.tacos.security;

import kr.gracelove.tacocloud.tacos.User;
import kr.gracelove.tacocloud.tacos.data.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */
@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public UserRepositoryUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if (user != null) {
            return user;
        }

        throw new UsernameNotFoundException(s);
    }
}
