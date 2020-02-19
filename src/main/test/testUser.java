import com.meiyukai.domain.User;
import com.meiyukai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testUser {
    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void testFindAllUsers(){
        List<User> users  =  userService.findAllUsers();
        for (User user : users ){
            System.out.println("user  :   "  + user);
        }
    }

}
