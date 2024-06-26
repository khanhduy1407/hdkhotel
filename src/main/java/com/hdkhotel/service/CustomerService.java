package com.hdkhotel.service;

import com.hdkhotel.model.Customer;

import java.util.Optional;

public interface CustomerService {
  Optional<Customer> findByUserId(Long userId);

  Optional<Customer> findByUsername(String username);
}
