/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pitcha
 */
@WebService(serviceName = "CalCircleWS")
public class CalCircleWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calArea")
    public double calArea(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 3.14 * r * r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calCircumference")
    public double calCircumference(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        return 2 * 3.14 * r;
    }
    
    
}
