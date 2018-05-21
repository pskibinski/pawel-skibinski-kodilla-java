package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Apple");
        Product product2 = new Product("Orange");
        Product product3 = new Product("Peach");
        Item item1 = new Item(new BigDecimal("2"), 100, new BigDecimal("200"));
        Item item2 = new Item(new BigDecimal("3"), 50, new BigDecimal("150"));
        Item item3 = new Item(new BigDecimal("5"), 10, new BigDecimal("50"));
        Item item4 = new Item(new BigDecimal("2"), 50, new BigDecimal("100"));
        product1.getItems().add(item1);
        product1.getItems().add(item4);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product1);
        Invoice invoice = new Invoice("001/2018");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);


        //Then
        Item temp = itemDao.findOne(item1.getId());
        Assert.assertEquals(item1.getValue(), temp.getValue());

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}
