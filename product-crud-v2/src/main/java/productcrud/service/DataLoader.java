package productcrud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import productcrud.model.Product;
import productcrud.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

//@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,1L, "Shirt", 1L, 10, "https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(2L,2L, "Head Phones", 9L, 20,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(3L,3L, "Shorts", 1L, 40, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(4L, 4L,"Mac book Laptop", 1L, 12,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(6L, 6L,"I-Phone 11", 9L, 43,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(5L, 5L,"Book", 1L, 55, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(7L, 7L,"Samsung TV", 9L,  56, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(8L, 8L,"Fridge", 1L, 43, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(9L, 9L,"Microwave", 1L, 56,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));

        products.add(new Product(11L, 1L,"Shirt", 10L, 67,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(12L, 2L,"Head Phones", 2L, 26,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(13L, 3L,"Shorts", 2L, 46, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(14L, 4L,"Mac book Laptop", 2L, 62,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(15L, 5L,"Book", 10L, 65, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(16L, 6L,"I-Phone 11", 2L, 63,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(17L, 7L,"Samsung TV", 2L,  66, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(18L, 8L,"Fridge", 2L, 43, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(19L, 9L,"Microwave", 10L, 66, "https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));

        products.add(new Product(21L, 1L,"Shirt", 3L, 45,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(22L, 2L,"Head Phones", 3L, 40,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(23L, 3L,"Shorts", 3L, 44, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(24L, 4L,"Mac book Laptop", 3L, 32,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg"             ,"New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(25L, 5L,"Book", 3L, 53, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(26L, 6L,"I-Phone 11", 3L, 23,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(27L, 7L,"Samsung TV", 11L,  36, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(28L, 8L, "Fridge", 11L, 43, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(29L, 9L,"Microwave", 11L, 46,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));

        products.add(new Product(31L, 1L,"Shirt", 4L, 30,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(32L, 2L,"Head Phones", 4L, 20,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(33L, 3L,"Shorts", 12L, 10, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(34L, 4L,"Mac book Laptop", 12L, 13,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(35L, 5L,"Book", 12L, 51, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(36L, 6L,"I-Phone 11", 4L, 44,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(37L, 7L,"Samsung TV", 4L,  4, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(38L, 8L,"Fridge", 4L, 13, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(39L, 9L,"Microwave", 4L, 33,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));


        products.add(new Product(41L, 1L,"Shirt", 11L, 35,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(42L, 2L,"Head Phones", 12L, 20,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(43L, 3L,"Shorts", 5L, 41, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(44L, 4L,"Mac book Laptop", 5L, 23,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(45L, 5L,"Book", 5L, 55, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(46L, 6L,"I-Phone 11", 5L, 4,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(47L, 7L,"Samsung TV", 5L,  64, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(48L, 8L,"Fridge", 5L, 41, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(49L, 9L,"Microwave", 5L, 36,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));



        products.add(new Product(51L, 1L,"Shirt", 6L, 7,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(52L, 2L,"Head Phones", 6L, 40,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(53L, 3L,"Shorts", 6L, 4, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(54L, 4L,"Mac book Laptop", 6L, 3,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(55L, 5L,"Book", 6L, 5, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(56L, 6L,"I-Phone 11", 6L, 4,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(57L, 7L,"Samsung TV", 6L,  6, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(58L, 8L,"Fridge", 6L, 4, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(59L, 9L,"Microwave", 10L, 3,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));


        products.add(new Product(61L, 1L,"Shirt", 7L, 45,"https://ae01.alicdn.com/kf/HTB1cHj5DxSYBuNjSspjq6x73VXaW/M-5XL-2020-New-Spring-Autumn-Slim-Fit-Men-Plaid-Shirt-Long-Sleeve-Mens-Red-Plaid.jpg",
                "Mens Shirts at Macy's come in all styles and sizes. Shop , casual, dress and more shirts for men & get free shipping w/minimum purchase!"));
        products.add(new Product(62L, 2L,"Head Phones", 7L, 5,"https://static.bhphoto.com/images/images1000x1000/1504613219_1360331.jpg",
                "Much like their predecessors, the Sony WH-1000XM3 are premium wireless over-the-ear headphones. They have active noise cancellation (ANC), Bluetooth and near-field communication (NFC) connectivity."));
        products.add(new Product(63L, 3L,"Shorts", 7L, 45, "https://www.dickies.com/dw/image/v2/AAYI_PRD/on/demandware.static/-/Sites-master-catalog-dickies/default/dw1d41afb7/images/main/WR557_BK_FR.jpg?sw=583&sh=746&sm=fit",
                "Traditionally, shorts have never held a prominent place among gentlemen in public, aside from wearing them to the beach or on the tennis court."));
        products.add(new Product(64L, 4L,"Mac book Laptop", 7L, 4,"https://images.macrumors.com/t/W9GPfL-pMfLdWzEmfgVumUam5eE=/1600x0/article-new/2019/07/base-13-inch-macbook-pro-touch-bar-2019.jpeg",
                "New 13-inch model with faster performance and a new Magic Keyboard. Buy now. Touch Bar and Touch ID. 2x the storage capacity. Up to 32 GB memory. Up to 10th-gen processors."));
        products.add(new Product(65L, 5L,"Book", 7L, 12, "https://jewishwebsite.com/wp-content/uploads/2018/12/becoming.jpg",
                "Becoming is the memoir of former United States first lady Michelle Obama published in 2018. "));
        products.add(new Product(66L, 6L,"I-Phone 11", 7L, 55,"https://www.boostmobile.com/content/dam/boostmobile/en/products/phones/apple/iphone-11-pro/space-gray/device-back.jpg.transform/pdpCarousel/image.jpg",
                "The phone is powered by Hexa Core (2.65 GHz, Dual core, Lightning + 1.8 GHz, Quad core, Thunder) processor. It runs on the Apple A13 Bionic Chipset. It has 4 GB RAM and 64 GB internal storage. "));
        products.add(new Product(67L, 7L,"Samsung TV", 7L,  73, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6290/6290167_sd.jpg",
                "Samsung - 75inch Class - LED - NU6900 Series - 2160p - Smart - 4K UHD TV with HDRQuantum Dot Technology delivers over a billion shades of color that stay true-to-life. Quantum HDR brings out the detail and contrast by expanding the range of color and detail beyond what's possible on HDTVs"));
        products.add(new Product(68L, 8L,"Fridge", 7L, 65, "https://cdn4.vectorstock.com/i/1000x1000/77/08/modern-fridge-freezer-refrigerator-vector-21037708.jpg",
                "Whirlpool 25 Cu. Ft. French Door Refrigerator In Fingerprint Resistant Stainless Steel. Multi-vent technology evenly cools every shelf so you can eat healthier with food that stays fresher longer.French door or side-by-side), standard refrigerator dimensions range from 28 ¾ to 39 ¾ inches in width, 61 ¾ to 71 ¼ inches in height and 28 ¾ to 34 ⅝ inches in depth."));
        products.add(new Product(69L, 9L,"Microwave", 9L, 7,"https://www.ajmadison.com/ajmadison/images/large_no_watermark/ME16H702SES.jpg",
                "LG - 2.0 Cu. Ft. Family-Size Microwave - PrintProof Black Stainless Steel. Microwave ovens heat foods quickly and efficiently because excitation is fairly uniform in the outer 25–38 mm (1–1.5 inches) of a homogeneous, high water content food item."));

        productRepository.saveAll(products);
    }
}
