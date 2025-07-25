import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
class ShippingAddress
{
    String street;
    String city;
    int pincode=0;
    String country;
    ShippingAddress()
    {

    }
        void display()
        {
          street="main";
          city="newyork";
          pincode=65254;
          country="america";
          System.out.println(street);
            System.out.println(city);
            System.out.println(pincode);
            System.out.println(country);


        }
    }


