// package com.example.demo.config;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class DataInitializer {

//     private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);

//     @Bean
//     public CommandLineRunner loadData(UserRepository repository) {
//         return args -> {
//             logger.info("Preloading data into H2...");
//             repository.save(new User("Alice", "alice@example.com"));
//             repository.save(new User("Bob", "bob@example.com"));
//             logger.info("Initial users added to H2.");
//         };
//     }
// }
