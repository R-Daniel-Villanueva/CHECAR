package mx.com.axity.services.service;

import mx.com.axity.model.UserDO;
import mx.com.axity.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class becaServiceTest extends BaseTest {


    @Autowired IbecaService becaService;
//    @Autowired protected UserService userService;

    @Test
    public void updateExisteRegistro() {
        UserDO userDO= this.becaService.getIdUser((long)7);
        Assert.assertTrue(userDO!=null);
        Assert.assertTrue(new Long(7).equals((userDO).getId()));
        Assert.assertTrue("NOMBRE 8".equals(userDO.getName()));
    }
    /*
    @Test
    public void updateNoExisteRegistro() {

    }
*/
}
