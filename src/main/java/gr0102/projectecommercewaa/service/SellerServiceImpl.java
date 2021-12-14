package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.repo.ProductRepo;
import gr0102.projectecommercewaa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    ProductService productService;

    @Override
    public void addProduct(Product p) {
        productService.save(p);
    }

    @Override
    public Product getProduct(long id) {
        return productService.findById((int)id);
    }

    @Override
    public void updateProduct(long id, Product p) {
        productService.updateById((int)id, p);
    }

    @Override
    public void deleteProduct(long id) {
        productService.deleteById((int)id);
    }

    @Override
    public List<Product> getAll() {
        return productService.getAll();
    }
}
