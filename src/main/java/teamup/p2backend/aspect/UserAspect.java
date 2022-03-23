package teamup.p2backend.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class UserAspect {

    Logger logger = Logger.getLogger(UserAspect.class);

    @Before("execution(* createUser*(..))")
    public void BeforeCreatingUser(JoinPoint joinPoint) {
        logger.info("User created / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* getAllUsers*(..))")
    public void BeforeGettingUser(JoinPoint joinPoint) {
        logger.info("Every user retrieved / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* getUsersById*(..))")
    public void BeforeGettingUsersById(JoinPoint joinPoint) {
        logger.info("User is retrieved by id / Command signature:  " + joinPoint.getSignature());
    }
    @After("execution(* getUsersById*(..))")
    public void AfterGettingUsersById(JoinPoint joinPoint) {
        logger.info("User is retrieved by id / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* getUsersByUsername*(..))")
    public void BeforeGettingUsersByUsername(JoinPoint joinPoint) {
        logger.info("Users are retrieved by Username. Command signature:  " + joinPoint.getSignature());
    }

}