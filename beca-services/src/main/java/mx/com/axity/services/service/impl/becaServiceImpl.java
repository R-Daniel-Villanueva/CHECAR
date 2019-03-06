package mx.com.axity.services.service.impl;

import mx.com.axity.model.UserDO;
import mx.com.axity.persistence.UserDAO;
import mx.com.axity.services.service.IbecaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class becaServiceImpl implements IbecaService {

    static final Logger LOG = LogManager.getLogger(becaServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserDO> getAllUsers() {
        return (List<UserDO>) this.userDAO.findAll();

    }

    @Override
    public UserDO getIdUser(Long id) {

        return this.userDAO.findById(id).get();//manejo de excepcion para que no sea el resultado del arreglo nulo
    }

    @Override
    public void deleteUser(Long id) {
        this.userDAO.deleteById(id);
    }

    @Override
    public void insertUser(UserDO userDO) {
        this.userDAO.save(userDO);
    }

    @Override
    public void updateUser(UserDO userDO) {
            this.userDAO.save(userDO);
    }

}
