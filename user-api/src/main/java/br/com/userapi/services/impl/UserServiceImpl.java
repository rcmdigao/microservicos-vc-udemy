package br.com.userapi.services.impl;

import br.com.userapi.domain.User;
import br.com.userapi.reporitories.UserRepository;
import br.com.userapi.services.UserService;
import br.com.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encotrado!!!"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
