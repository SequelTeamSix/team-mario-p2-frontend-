package teamup.p2backend.aspect;

import teamup.p2backend.model.Event;
import teamup.p2backend.controller.EventController;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;
@Component
@Aspect


public class P2EventAspect {
    Logger logger = Logger.getLogger(P2EventAspect.class);

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

