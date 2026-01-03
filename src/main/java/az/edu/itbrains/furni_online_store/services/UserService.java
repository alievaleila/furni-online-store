package az.edu.itbrains.furni_online_store.services;

import az.edu.itbrains.furni_online_store.dtos.RegisterDto;

public interface UserService {

    boolean registerUser(RegisterDto registerDto);
    
}
