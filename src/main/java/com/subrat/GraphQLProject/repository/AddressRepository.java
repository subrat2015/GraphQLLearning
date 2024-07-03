package com.subrat.GraphQLProject.repository;

import com.subrat.GraphQLProject.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
