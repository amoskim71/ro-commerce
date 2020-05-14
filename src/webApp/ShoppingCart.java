//package webApp;
//
//import dataLayer.Product;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//public class ShoppingCart extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String searchQuery = request.getParameter("cart");
//        if (searchQuery.length() >= 3) { //at least 3 characters for the search field
//            Product productObj = new Product();
//            List<Product> products;
//            products = productObj.getProducts(searchQuery, null);  // Either by name(search) or by id(forCart)
//            //TODO: Data validation
//
//            request.setAttribute("uSearchedProducts", products);
//            request.getRequestDispatcher("/productSearch.jsp").forward(request, response);
//        } else response.sendRedirect("homepage"); // go drunk, you're home
//    }
//}
