package in.ad.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ad.model.Cart;
import in.ad.model.Item;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

    // Static menu items
    private List<Item> menu = Arrays.asList(
        new Item(1, "Pizza", 250.0),
        new Item(2, "Burger", 150.0),
        new Item(3, "Pasta", 200.0),
        new Item(4, "Cold Drink", 50.0)
    );

    @RequestMapping("/menu")
    public ModelAndView showMenu() {
        ModelAndView mv = new ModelAndView("menu");
        mv.addObject("menu", menu);
        return mv;
    }

    @RequestMapping("/addToCart")
    public ModelAndView addToCart(@RequestParam("id") int id, HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        Item selected = menu.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
        if (selected != null) cart.addItem(selected);

        ModelAndView mv = new ModelAndView("cart");
        mv.addObject("cart", cart);
        return mv;
    }
    @RequestMapping("/cart")
    public ModelAndView showCart(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        ModelAndView mv = new ModelAndView("cart");
        mv.addObject("cart", cart);
        return mv;
    }


    @RequestMapping("/checkout")
    public ModelAndView checkout(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) cart = new Cart();

        double total = cart.getTotal();   

        ModelAndView mv = new ModelAndView("checkout");
        mv.addObject("total", total);     
        mv.addObject("cart", cart);       

        cart.clear(); 
        return mv;
    }

}
