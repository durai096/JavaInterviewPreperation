package JavaCommonQA.problem3;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Product p1=new Product(1234,"Java","Book",1500);
        Product p2=new Product(5678,"Angular","Book",200000);
        Product p3=new Product(9101,"SpringBoot","Book",300);
        Product p8=new Product(9101,"SpringBoot","Book",300);
        Product p4=new Product(1213,"Iphone","Phone",150000);
        Product p7=new Product(1213,"Iphone","Phone",150000);
        Product p5=new Product(1415,"Samsung","Phone",10000);
        Product p6=new Product(1617,"Redmi","Phone",15000);
        List<Product>productList= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        // Aggregate based on  Redmi
      Map<String, List<Product>> Aggregate= productList.stream().filter(s->s.getName().equals("Redmi")).collect(Collectors.groupingBy(s->s.getName()));
        System.out.println("Aggregate : "+Aggregate);

        Set<String>set=new HashSet<>();

        //duplicates
        System.out.println("Duplicates Only : ");
         productList.stream().filter(num->!set.add(num.name)).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println("Duplicates Only: "+Duplicates);
        Set<String>set1=new HashSet<>();
        //without duplicates

        List<Product>withoutDuplicates=productList.stream().distinct().collect(Collectors.toList());
        System.out.println("without Duplicates: "+withoutDuplicates);
//        System.out.println("without Duplicates: "+withoutDuplicates);
        //in phone category minimum price
      Product category= productList.stream().filter(s->s.getCategory().equalsIgnoreCase("Phone")).min(Comparator.comparing(Product::getPrice)).get();
       System.out.println("phone category minimum price: "+category);
       // find phone category only
      List<Product> PhoneCategory= productList.stream().filter(s->s.getCategory().equals("Phone")).collect(Collectors.toList());
        System.out.println("Phone Category Only : "+PhoneCategory);
        //find price wise low
       List<Product> priceLow= productList.stream().filter(s->s.getPrice()>10000).collect(Collectors.toList());
        System.out.println("Price wise >10000: "+priceLow);

    }
}
