package com.afalenkin.webfluxnotes.service;

import com.afalenkin.webfluxnotes.domain.User;
import com.afalenkin.webfluxnotes.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;

    public Flux<User> getAll() {
        return usersRepository.findAll();
    }
}