package mx.com.axity.services.service;

import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaService {

    List<UserDO> getAllUsers();
    UserDO getIdUser(Long id);
    void deleteUser(Long id);
    void insertUser(UserDO userDO);
    void updateUser(UserDO userDO);
}

