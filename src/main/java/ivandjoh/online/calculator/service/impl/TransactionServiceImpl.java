package ivandjoh.online.calculator.service.impl;

import ivandjoh.online.calculator.dao.Product;
import ivandjoh.online.calculator.repository.ProductRepository;
import ivandjoh.online.calculator.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ResponseEntity<List<Product>> getAllProducts() {

        try {
            List<Product> products = productRepository.findAll();
            return ResponseEntity.ok(products);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
