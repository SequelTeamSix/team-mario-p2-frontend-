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

    @Before("execution(* postSport*(..))")
    public void BeforeAddingSport(JoinPoint joinPoint){
        logger.info("Sport addition logged / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* deleteSport*(..))")
    public void BeforeDeletingSport(JoinPoint joinPoint){
        logger.info("Executing: Delete sport logged / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* getSport*(..))")
    public void BeforeGettingASport(JoinPoint joinPoint){
        logger.info("Executing: Get (a) sport logged / Command signature:  " + joinPoint.getSignature());
    }

    @After("execution(* getSports*(..))")
    public void BeforeGettingAllSport(JoinPoint joinPoint){
        logger.info("Retrieving All Sports Logged / Command signature:  " + joinPoint.getSignature());
    }



}
