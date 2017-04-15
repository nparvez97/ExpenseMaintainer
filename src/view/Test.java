
package view;

import dao.HibernateDao;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author NP-97
 */
public class Test {
    public static void main(String[] args) {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("view/SpringXMLConfig.xml");
        
        HibernateDao hd=context.getBean(HibernateDao.class);
        
        hd.saveUser(new User("parvez2", "a@gmail.com", "123", 13, "0171111111", "Dhaka"));
        
    }
    
}
