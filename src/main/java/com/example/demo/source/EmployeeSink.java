package com.example.demo.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EmployeeSink {

    String REGISTER = "employeeRegistrationChannel";

    @Input(REGISTER)
    SubscribableChannel employeeRegistration();
}
