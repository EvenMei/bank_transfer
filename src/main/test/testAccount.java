import com.meiyukai.domain.Account;
import com.meiyukai.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testAccount {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void testFindAllAccounts(){
        List<Account> accounts   =  accountService.findAllAccounts();
        for(Account account : accounts){
            System.out.println("account   :  " + account);
        }
    }

    @Test
    public void testUpdateAccount(){
        accountService.updateAccountById(3,10000.0);
    }

    @Test
    public void testFindAccountByName(){
        Account account = accountService.findAccount("zhangsan");
        System.out.println("zhangsan  :  "+account);
    }


    @Test
    public void testTransfer(){
        List<Account> accounts = accountService.findAllAccounts();
        for (Account account : accounts){
            System.out.println("account  :   " +  account);
        }
        System.out.println("-----------------------转账后如下------------------------");
        accountService.transfer("zhangsan" , "lisi" , 1000.0);
        List<Account> accounts2= accountService.findAllAccounts();
        for (Account account : accounts2){
            System.out.println("account  :   " +  account);
        }
    }




}
