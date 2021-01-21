package com.example.rest.customerService.Repository;

import com.example.rest.customerService.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Page<Account> findByCustomerCustomerId(Integer customerId, Pageable pageable);
}
