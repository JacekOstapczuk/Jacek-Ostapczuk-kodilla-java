package com.kodilla.hibernate.manytomany.facade;


public class FindingProcessingException  extends Exception {

    public static String   ERR_NOT_FOUND_EMPLOYEE = "No match employee found";
    public static String   ERR_NOT_FOUND_COMPANY = "No match company found";

    public  FindingProcessingException (String message){
        super (message);
    }
}
