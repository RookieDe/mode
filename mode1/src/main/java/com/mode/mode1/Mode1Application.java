package com.mode.mode1;

import com.mode.mode1.entity.OperationEntity;
import com.mode.mode1.factory.OperationFactory;
import com.mode.mode1.service.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
public class Mode1Application {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A：");
            BigDecimal num1 = sc.nextBigDecimal();
            System.out.println("请输入运算符号（+,-,*,/）：");
            String type = sc.next();
            System.out.println("请输入数字B：");
            BigDecimal num2 = sc.nextBigDecimal();

            OperationEntity operationEntity = new OperationEntity(num1,num2);
            Operation operation = OperationFactory.getType(type);
            BigDecimal result = operation.getResult(operationEntity);
            System.err.println(result);
        }

    }

}
