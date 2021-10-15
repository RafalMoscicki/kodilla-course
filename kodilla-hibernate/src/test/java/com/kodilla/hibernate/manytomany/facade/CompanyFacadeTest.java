package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void shouldFindCompanyByName() {
        //Given
        Company company1 = new Company("Ala ma kota");
        Company company2 = new Company("Kota Ala ma");
        Company company3 = new Company("Ma kota Ala");
        Company company4 = new Company("ala ma kota");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        //When
        Collection<Company> result = companyFacade.findByName("Ala");

        //Then
        assertEquals(3, result.size());

        //Clean up
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);
        companyDao.delete(company4);
    }
}