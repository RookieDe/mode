package com.mode.mode1.factory;

import com.mode.mode1.service.Operation;
import com.mode.mode1.service.impl.OperationAdd;
import com.mode.mode1.service.impl.OperationDiv;
import com.mode.mode1.service.impl.OperationMul;
import com.mode.mode1.service.impl.OperationSub;

/**
 *
 *
 * @author RookieDe
 * @ClassName OperationFactory
 * @date 2020/6/11 18:42
 */
public class OperationFactory {

    public static Operation getType(String type){
        Operation operation = null;
        switch (type){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("请输入正确字符");
        }
        return operation;
    }
}
