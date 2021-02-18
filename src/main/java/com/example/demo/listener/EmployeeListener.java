package com.example.demo.listener;

import com.example.demo.model.Employee;
import com.example.demo.source.EmployeeSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(EmployeeSink.class)
public class EmployeeListener {
    @StreamListener(target = EmployeeSink.REGISTER)
    public void processRegisterEmployees(String employee) {
        System.out.println("Employees Registered by Client " + employee);
    }

}
