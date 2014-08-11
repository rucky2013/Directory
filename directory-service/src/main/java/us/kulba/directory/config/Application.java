package us.kulba.directory.config;

import com.mongodb.Mongo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import us.kulba.directory.dao.ContactRepository;

@EnableAutoConfiguration
@EnableMongoRepositories(basePackageClasses = ContactRepository.class)
@ComponentScan({"us.kulba.directory.web.controller"})
public class Application  {

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        String mongoDbHost = "localhost";
        int mongoDbPort = 27017;
        Mongo mongo = new Mongo(mongoDbHost, mongoDbPort);
//        UserCredentials userCredentials = new UserCredentials(username, password);
        String databaseName = "directory";
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongo, databaseName);
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
        return mongoTemplate;
    }


    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}