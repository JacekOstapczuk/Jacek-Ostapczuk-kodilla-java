package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindingFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindingFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public FindingFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Employee> findEmployee(String searchingArgument) {
        List<Employee> searchingEmployees = employeeDao.retrieveEmployeesContained(searchingArgument);
        return searchingEmployees;
    }

    public List<Company> findCompany(String searchingArgument) {
        List<Company> searchingCompany = companyDao.retrieveCompanyContained(searchingArgument);
        return searchingCompany;
    }
}
