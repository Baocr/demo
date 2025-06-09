package com.example.demo;

import org.springframework.stereotype.Service;

@Service // Đánh dấu lớp này là một Service trong Spring
public class UserService {
    private final UserRepository userRepository; // Khai báo UserRepository để sử dụng trong UserService

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void registerUser() {
        userRepository.save(); // Gọi phương thức save() từ UserRepository để lưu người dùng
    }
}
