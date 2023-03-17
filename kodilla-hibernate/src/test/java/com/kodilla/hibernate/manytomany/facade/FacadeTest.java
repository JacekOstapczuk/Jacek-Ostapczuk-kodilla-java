package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTest {

    @Autowired
    FindingFacade findingFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindingFacade() {

        //Given
        Employee employee1 = new Employee("Anna", "Kraj");
        Employee employee2 = new Employee("Joanna", "Krajewska");
        Employee employee3 = new Employee("Zuzanna", "Krajowa");
        Employee employee4 = new Employee("Marianna", "Krakowska");
        Employee employee5 = new Employee("Daria", "Kremowa");

        Company company1 = new Company("Fabryka");
        Company company2 = new Company("Urzad");
        Company company3 = new Company("BiuroStoleczne");
        Company company4 = new Company("BiuroWojwwodzkie");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        //When
        List<Company> findUro = findingFacade.findCompany("%uro%");
        List<Employee> findRaj = findingFacade.findEmployee("%raj%");
        List<Employee> findAnna = findingFacade.findEmployee("%anna%");

        //Then
        assertEquals(2, findUro.size());
        assertEquals(3, findRaj.size());
        assertEquals(4, findAnna.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
