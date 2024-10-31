package com.cumulusclouds.w4153cumuluscloudsmstransactions;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This class contains all the API routes for the system.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/transactions")
public class RouteController {

  @Operation(
          summary = "Get welcome message",
          description = "Returns a welcome message for the transactions API."
  )
  @ApiResponse(
          responseCode = "200",
          description = "Successfully returns welcome message",
          content = @Content(
                  mediaType = "text/plain"
          )
  )
  @ApiResponse(
          responseCode = "500",
          description = "Internal Server Error"
  )
  @GetMapping({"/", "/index", "/home"})
  public String index() {
    return "Welcome!";
  }

  @Operation(
          summary = "Update payment information",
          description = "Updates payment information with the provided details."
  )
  @ApiResponse(
          responseCode = "200",
          description = "Payment information updated successfully",
          content = @Content(
                  mediaType = "application/json"
          )
  )
  @ApiResponse(
          responseCode = "400",
          description = "Invalid payment data provided"
  )
  @ApiResponse(
          responseCode = "500",
          description = "Internal Server Error"
  )
  @PostMapping("/payments")
  public ResponseEntity<String> updatePayments(@RequestBody String payments) {
    return new ResponseEntity<>(payments, HttpStatus.OK);
  }

  @Operation(
          summary = "Retrieve payment information",
          description = "Retrieves payment information for the specified payment ID."
  )
  @ApiResponse(
          responseCode = "200",
          description = "Payment information retrieved successfully",
          content = @Content(
                  mediaType = "application/json"
          )
  )
  @ApiResponse(
          responseCode = "404",
          description = "Payment not found"
  )
  @ApiResponse(
          responseCode = "500",
          description = "Internal Server Error"
  )
  @GetMapping("/payments/{paymendId}")
  public ResponseEntity<String> getPayment(@PathVariable String paymendId) {
    return new ResponseEntity<>(paymendId, HttpStatus.OK);
  }

  @Operation(
          summary = "Update customer information",
          description = "Updates customer information with the provided details."
  )
  @ApiResponse(
          responseCode = "200",
          description = "Customer information updated successfully",
          content = @Content(
                  mediaType = "application/json"
          )
  )
  @ApiResponse(
          responseCode = "400",
          description = "Invalid customer data provided"
  )
  @ApiResponse(
          responseCode = "500",
          description = "Internal Server Error"
  )
  @PostMapping("/customers")
  public ResponseEntity<String> updateCustomers(@RequestBody String customers) {
    return new ResponseEntity<>(customers, HttpStatus.OK);
  }

  @Operation(
          summary = "Retrieve customer information",
          description = "Retrieves customer information for the specified customer ID."
  )
  @ApiResponse(
          responseCode = "200",
          description = "Customer information retrieved successfully",
          content = @Content(
                  mediaType = "application/json"
          )
  )
  @ApiResponse(
          responseCode = "404",
          description = "Customer not found"
  )
  @ApiResponse(
          responseCode = "500",
          description = "Internal Server Error"
  )
  @GetMapping("/customers/{customerId}")
  public ResponseEntity<String> getCustomer(@PathVariable String customerId) {
    return new ResponseEntity<>(customerId, HttpStatus.OK);
  }
}