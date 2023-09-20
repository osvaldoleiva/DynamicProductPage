package com.example.DynamicProductPage.controller;

import com.example.DynamicProductPage.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

  @GetMapping("/")
  public String obtenerListaProductos(Model model) {

    // PASO 1 CREAR LISTA DE PRODUCTOS
    List<Product> miLista = new ArrayList<Product>();
    // PASO 2 CREAR LOS 10 PRODUCTOS
    Product product1 = new Product();
    product1.setId(1);
    product1.setNombre("Tanax");
    product1.setDescripcion("Mata pulgas");
    product1.setPrecio(1000);

    Product product2 = new Product();
    product2.setId(2);
    product2.setNombre("Baygon");
    product2.setDescripcion("Mata cucarachas");
    product2.setPrecio(2000);

    Product product3 = new Product();
    product3.setId(3);
    product3.setNombre("Cif");
    product3.setDescripcion("Limpia baños");
    product3.setPrecio(3000);

    Product product4 = new Product();
    product4.setId(4);
    product4.setNombre("Pato");
    product4.setDescripcion("Limpia vidrios");
    product4.setPrecio(4000);

    Product product5 = new Product();
    product5.setId(5);
    product5.setNombre("Clorox");
    product5.setDescripcion("Limpia pisos");
    product5.setPrecio(5000);

    Product product6 = new Product();
    product6.setId(6);
    product6.setNombre("Pinesol");
    product6.setDescripcion("Limpia pisos");
    product6.setPrecio(6000);

    Product product7 = new Product();
    product7.setId(7);
    product7.setNombre("Fabuloso");
    product7.setDescripcion("Limpia pisos");
    product7.setPrecio(7000);

    Product product8 = new Product();
    product8.setId(8);
    product8.setNombre("Ariel");
    product8.setDescripcion("Detergente");
    product8.setPrecio(8000);

    Product product9 = new Product();
    product9.setId(9);
    product9.setNombre("Downy");
    product9.setDescripcion("Suavizante");
    product9.setPrecio(9000);

    Product product10 = new Product();
    product10.setId(10);
    product10.setNombre("Vanish");
    product10.setDescripcion("Quita manchas");
    product10.setPrecio(10000);

    // PASO 3 AÑADIR AL MODELO LA LISTA DE PRODUCTOS
    miLista.add(product1);
    miLista.add(product2);
    miLista.add(product3);
    miLista.add(product4);
    miLista.add(product5);
    miLista.add(product6);
    miLista.add(product7);
    miLista.add(product8);
    miLista.add(product9);
    miLista.add(product10);

    System.out.println("PRODUCTO 1 = " + product1.toString());

    model.addAttribute("productos", miLista);
    return "index";
  }

}
