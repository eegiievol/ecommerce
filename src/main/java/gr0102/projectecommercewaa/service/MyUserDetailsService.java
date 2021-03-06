package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not FOUND..."));
        return new gr0102.projectecommercewaa.service.MyUserDetails(user.get());
    }


}
