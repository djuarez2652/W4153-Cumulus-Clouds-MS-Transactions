package com.cumulusclouds.w4153cumuluscloudsmstransactions;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.stripe.Stripe;

@SpringBootApplication
public class W4153CumulusCloudsMsTransactionsApplication {

  public static void main(String[] args) {
    SpringApplication.run(W4153CumulusCloudsMsTransactionsApplication.class, args);
  }

  public void run(String[] args) {
    Dotenv dotenv = Dotenv.load();
    Stripe.apiKey = dotenv.get("STRIPE_TEST_KEY");
    System.out.println("Application started");
  }
}
