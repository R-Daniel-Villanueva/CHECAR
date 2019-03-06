package mx.com.axity.services.facade.impl;

import mx.com.axity.commons.to.UserTO;
import mx.com.axity.model.UserDO;
import mx.com.axity.services.facade.IbecaFacade;
import mx.com.axity.services.service.IbecaService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class BecaFacade implements IbecaFacade {


    @Autowired
    ModelMapper modelMapper;
    @Autowired
    private IbecaService becaService;//inyeccion de dependencias

    @Override
    public List<UserTO> getAllUsers() {
        List<UserDO> userDOList= this.becaService.getAllUsers();
        Type userTOType = new TypeToken<List<UserTO>>() {}.getType();
        List<UserTO> result = this.modelMapper.map(userDOList, userTOType);
        return result;
    }

    @Override
    public UserTO getIdUser(Long id) {
        UserDO userDO=this.becaService.getIdUser(id);

        Type userTOType = new TypeToken<UserTO>() {}.getType();
        UserTO result = this.modelMapper.map(userDO, userTOType);
        return result;
    }

    @Override
    public void deleteUser(Long id) {
        this.becaService.deleteUser(id);
    }

    @Override
    public void insertUser(UserDO userDO) {
        this.becaService.insertUser(userDO);
    }
    @Override
    public void updateUser(UserDO userDO) {
        this.becaService.updateUser(userDO);
    }


}
