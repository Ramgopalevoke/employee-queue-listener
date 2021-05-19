package com.evoke.employeequeuelistener.eventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.evoke.employeequeuelistener.config.MQConfig;

@Component
public class EmployeeQueueListener {
    static Logger logger = LoggerFactory.getLogger(EmployeeQueueListener.class);

    @RabbitListener(queues = MQConfig.CREATION_QUEUE)
    public void employeeCreationListener(String notification) {
        logger.info(notification);
    }

}
