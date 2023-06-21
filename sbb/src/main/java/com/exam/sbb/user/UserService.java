package com.exam.sbb.user;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) throws SignupEmailDuplicatedException, SignupUsernameDuplicatedException{
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));

        try{
            userRepository.save(user);
        }catch (DataIntegrityViolationException e){

            if(userRepository.existsByUsername(username)){
                throw new SignupUsernameDuplicatedException("username쓴느중..");
            }else{
                throw new SignupEmailDuplicatedException("email사용중..");
            }
        }

        this.userRepository.save(user);
        return user;
    }
}