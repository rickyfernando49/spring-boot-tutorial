package com.example.service;

import com.example.data.UsersRepository;
import com.example.exceptions.NotFoundException;
import com.example.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    public User getUser(int userId) {
        return usersRepository
                .findById(userId)
                .orElseThrow(() -> new NotFoundException(User.class, userId));
    }

    public User createUser(User user) {
        user.setId(null);
        return usersRepository.save(user);
    }

    public User updateUser(User user) {
        var existingUser = usersRepository
                .findById(user.getId())
                .orElseThrow(() -> new NotFoundException(User.class, user.getId()));

        existingUser.setName(user.getName() != null ? user.getName() : existingUser.getName());
        existingUser.setSkills(user.getSkills() != null ? user.getSkills() : existingUser.getSkills());

        return usersRepository.save(existingUser);
    }

    public void deleteUser(int userId) {
        usersRepository.deleteById(userId);
    }
}
