package com.example.billingservice.reposetories;

import com.example.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.List;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<ProductItem,Long> {
    @RestResource(path = "/byBillId")
    List<ProductItem> findAllByBill_Id(@Param("billId") Long id);

    //Collection<ProductItem> findAllByBill_(@Param("billId") Long id);
}
