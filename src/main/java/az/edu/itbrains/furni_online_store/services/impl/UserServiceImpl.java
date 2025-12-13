package az.edu.itbrains.furni_online_store.services.impl;

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






}
