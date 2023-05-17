package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.nadeem.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Serializable> {

}
