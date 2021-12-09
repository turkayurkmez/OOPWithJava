package com.company;

public class ProductService {
    public int AddProduct(Product product){
        DbHelper helper = new DbHelper("baglanti...");
        String[] names = {"@name","@price"};
        Object[] params = {product.getName(), product.getPrice()};

        int result= helper.ExecuteNonQuery("Insert...",names,params);
        return result;

    }
}
