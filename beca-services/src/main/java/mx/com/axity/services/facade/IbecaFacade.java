package mx.com.axity.services.facade;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;

import java.util.List;

public interface IbecaFacade {

    List<UserTO> getAllUsers();
    UserTO getIdUser(Long id);
    void deleteUser(Long id);
    void insertUser(UserDO userDO);
    void updateUser(UserDO userDO);

}
