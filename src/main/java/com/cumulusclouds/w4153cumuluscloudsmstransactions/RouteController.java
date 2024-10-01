package com.cumulusclouds.w4153cumuluscloudsmstransactions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This class contains all the API routes for the system.
 */
@RestController
public class RouteController {

  @GetMapping({"/", "/index", "/home"})
  public String index() {
    return "Welcome!";
  }

  @PostMapping("/payments")
  public ResponseEntity<String> updatePayments(@RequestBody String payments) {
    return new ResponseEntity<>(payments, HttpStatus.OK);
  }

  @GetMapping("/payments/{paymendId}")
  public ResponseEntity<String> getPayment(@PathVariable String paymendId) {
    return new ResponseEntity<>(paymendId, HttpStatus.OK);
  }

  @PostMapping("/customers")
  public ResponseEntity<String> updateCustomers(@RequestBody String customers) {
    return new ResponseEntity<>(customers, HttpStatus.OK);
  }

  @GetMapping("/customers/{customerId}")
  public ResponseEntity<String> getCustomer(@PathVariable String customerId) {
    return new ResponseEntity<>(customerId, HttpStatus.OK);
  }
}