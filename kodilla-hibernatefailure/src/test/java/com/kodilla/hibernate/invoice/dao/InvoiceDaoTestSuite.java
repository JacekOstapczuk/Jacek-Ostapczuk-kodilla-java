/* package com.kodilla.hibernate.invoice.dao;

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
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

@Test
public void    testInvoiceDaoSave(){

    //Given
    BigDecimal cenaSliwek = BigDecimal.valueOf(9);
    BigDecimal cenaMotoru = BigDecimal.valueOf(13333);
    BigDecimal cenaSamochodu =BigDecimal.valueOf(55555);
    BigDecimal cenaPapieru =BigDecimal.valueOf(23);

    Product sliwka = new Product("sliwka");
    Product motor = new Product("motor");
    Product samochod = new Product("samochod");
    Product papier = new Product("papier");
    Item koszSliwek = new Item(sliwka, cenaSliwek, 200);
    Item jedenMotor = new Item(motor, cenaMotoru, 5);
    Item jedenSamochod = new Item(samochod, cenaSamochodu, 2);
    Item kartonPapieru = new Item(papier, cenaPapieru, 5);
    Invoice pojedynczaFaktura = new Invoice("FV/203//2022/11/27");
    pojedynczaFaktura.setOneItem(koszSliwek);
    pojedynczaFaktura.setOneItem(jedenMotor);
    pojedynczaFaktura.setOneItem(jedenSamochod);
    pojedynczaFaktura.setOneItem(kartonPapieru);

    //When
invoiceDao.save(pojedynczaFaktura);
int pojedynczaFakturaID =pojedynczaFaktura.getId();
itemDao.save(jedenMotor);
    int jedenMotorID =jedenMotor.getId();
productDao.save(sliwka);
    int sliwkaID =sliwka.getId();
    //Then
    assertNotEquals(0, pojedynczaFakturaID);
    assertNotEquals(0, jedenMotorID);
    assertNotEquals(0, sliwkaID);
}
}

 */