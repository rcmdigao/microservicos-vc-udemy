package br.com.userapi.services.impl;

import br.com.userapi.domain.User;
import br.com.userapi.reporitories.UserRepository;
import br.com.userapi.services.UserService;
import br.com.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final Environment env;
    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encotrado!!!"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
