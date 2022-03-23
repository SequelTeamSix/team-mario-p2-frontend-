package teamup.p2backend.aspect;



import org.aspectj.lang.annotation.After;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect


public class SportAspect {
    Logger logger = Logger.getLogger(SportAspect.class);

    @Before("execution(* addSport*(..))")
    public void BeforeAddingSport(JoinPoint joinPoint){
        logger.info("Sport addition logged / Command signature:  " + joinPoint.getSignature());
    }

    @After("execution(* getAllSports*(..))")
    public void BeforeGettingAllSport(JoinPoint joinPoint){
        logger.info("All Sports Logged / Command signature:  " + joinPoint.getSignature());
    }

}
