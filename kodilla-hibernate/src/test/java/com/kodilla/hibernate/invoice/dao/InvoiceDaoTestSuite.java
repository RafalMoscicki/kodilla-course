package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("milk");
        productDao.save(product);
        Item item1 = new Item(new BigDecimal("4.00"), 3);
        Item item2 = new Item(new BigDecimal("3.00"), 6);
        item1.setProduct(product);
        item2.setProduct(product);
        Invoice invoice = new Invoice("5423987");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);

        //Then
        assertNotEquals(0, invoice.getId());
        assertNotEquals(0, item1.getId());
        assertNotEquals(0, item2.getId());
        assertNotEquals(0, product.getId());

        //CleanUp
        invoiceDao.deleteById(invoice.getId());
        productDao.deleteById(product.getId());
    }
}
