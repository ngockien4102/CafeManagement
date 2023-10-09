package com.example.demo.Service;

import com.example.demo.Wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    ResponseEntity<String> signUp(Map<String, String> requestMap);

    ResponseEntity<String> login(Map<String, String> requestMap);

    ResponseEntity<List<UserWrapper>> getALlUser();

    ResponseEntity<String> updateUser(Map<String, String> requestMap);
}
