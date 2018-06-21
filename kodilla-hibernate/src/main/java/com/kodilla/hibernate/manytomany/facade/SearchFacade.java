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
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void employeesSearch(String s) {
        LOGGER.info("Start searching for employees by " + "'" + s + "'" + " in last name.");
        List<Employee> employees = employeeDao.findEmployeeByAnyFragment(s);
        System.out.println("Result:");
        employees.stream().forEach(e -> System.out.println(e.getLastName() + " " + e.getFirstName()));
    }

    public void companySearch(String s) {
        LOGGER.info("Start searching for companies by " + "'" + s + "'" + " company name.");
        List<Company> companies = companyDao.findCompanyByAnyFragment(s);
        System.out.println("Result:");
        companies.stream().forEach(c -> System.out.println(c.getName()));
    }
}
