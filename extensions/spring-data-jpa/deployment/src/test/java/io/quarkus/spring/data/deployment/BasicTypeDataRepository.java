package io.quarkus.spring.data.deployment;

import java.net.URL;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicTypeDataRepository extends JpaRepository<BasicTypeData, Integer> {

    @Query("select doubleValue from BasicTypeData where urlValue= :url")
    Double findPriceOfProduct(URL url);
}
