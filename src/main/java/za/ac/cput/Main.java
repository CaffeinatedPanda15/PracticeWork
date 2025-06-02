package za.ac.cput;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

       // Book b1 = BookFactory.createBook("1984", "Orson wells", "Oxford", 55);

        //Contacts con1 = new Contacts.Builder()
            //    .setContactNumber(12345689)
            //    .setHomeAddress("22 megara lane")
            //    .build();

//builders stop here

        //System.out.println(b1.toString());

    }


}