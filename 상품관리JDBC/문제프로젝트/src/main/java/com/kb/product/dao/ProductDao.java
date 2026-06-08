package com.kb.product.dao;

import com.kb.product.vo.Product;
import com.kb.product.vo.ProductDetail;
import java.util.*;

/** TODO: 문제 5~8번 JDBC 기능을 구현하세요. */
public class ProductDao {
    public int insert(Product product) {
        // TODO 문제 5번 구현
        return 0;
    }
    public List<Product> selectList(int count) {
        // TODO 문제 6번 구현
        return new ArrayList<>();
    }
    public Product selectOne(int productId) {
        // TODO 문제 7번 구현
        return null;
    }
    public ProductDetail getProductDetail(int productId) {
        // TODO 문제 8번 구현
        return null;
    }
}
