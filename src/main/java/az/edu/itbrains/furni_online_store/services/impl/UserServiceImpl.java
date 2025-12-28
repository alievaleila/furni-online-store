package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.RegisterDto;
import az.edu.itbrains.furni_online_store.models.User;
import az.edu.itbrains.furni_online_store.repositories.UserRepository;
import az.edu.itbrains.furni_online_store.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean registerUser(RegisterDto registerDto){
        User findUser=userRepository.findByUsername(registerDto.getUsername());
        if(findUser!=null){
            return false;
        }

        User user=new User();
        user.setEmail(registerDto.getEmail());
        user.setUsername(registerDto.getUsername());

        String password=passwordEncoder.encode(registerDto.getPassword());
        user.setPassword(password);
        userRepository.save(user);
        return true;
    }






}
