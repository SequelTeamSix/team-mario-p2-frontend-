package teamup.p2backend.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect


public class EventAspect {
    Logger logger = Logger.getLogger(EventAspect.class);

    @Before("execution(* saveEvent*(..))")
    public void BeforeSavingEvent(JoinPoint joinPoint){
        logger.info("Event Logged / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* updateEvent*(..))")
    public void BeforeUpdatingEvent(JoinPoint joinPoint){
        logger.info("Updated Event / Command signature:  " + joinPoint.getSignature());
    }

    @Before("execution(* getAllEvents*(..))")
    public void BeforeGettingAllEvent(JoinPoint joinPoint){
        logger.info("All Events Logged / Command signature:  " + joinPoint.getSignature());
    }

}

