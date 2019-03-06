package mx.com.axity.services.service;

import mx.com.axity.model.UserDO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.NoSuchElementException;

public class becaServiceTest extends BaseTest {


    @Autowired IbecaService ibecaService;
//    @Autowired protected UserService userService;

    @Test
    public void updateExisteRegistro() {
        UserDO userDO= this.ibecaService.getIdUser((long)8);
        Assert.assertTrue(userDO!=null);
        Assert.assertTrue(new Long(8).equals((userDO).getId()));
        Assert.assertTrue("NOMBRE 8".equals(userDO.getName()));
    }


    @Test
    public void updateNoExisteRegistro() {
        try{
            UserDO userDO=this.ibecaService.getIdUser((long)999);

        }catch(Throwable e){
            Assert.assertTrue(e instanceof NoSuchElementException);
        }
    }

}
