//package com.example.demo.services;
//
//import com.example.demo.entity.Discount;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//
//public interface DiscountService {
//
//        List<Discount> findAll();
//
//        Page<Discount> findAll(Pageable pageable);
//
//        Page<Discount> findAllAndSortByStartTime(Pageable pageable);
//
//        Page<Discount> findAllAndSortByFinishTime(Pageable pageable);
//
//        Page<Discount> findAllAndSortByDecreaseValue(Pageable pageable);
//
//        Page<Discount> findByStartTitle(Pageable pageable, String Title);
//
//        Page<Discount> findByStartTimeContaining(Pageable pageable, String StartDate);
//
//        Page<Discount> findByFinishTimeContaining(Pageable pageable, String FinishDate);
//
//        Page<Discount> findAllAndSortByDecreaseValue(Pageable pageable,String DecreaseValue);
//
//        Page<Discount> findByDecreaseValueAndStartTimeAndFinishTimeContaining(Pageable pageable,String DecreaseValue, String StartDate, String FinishDate);
//
//
//        void deleteDiscount(String title);
//
//        void save(Discount discount);
//
//
//        void update(Discount discount);
//
////        Discount findByTi(Integer id);
//
//
//}
