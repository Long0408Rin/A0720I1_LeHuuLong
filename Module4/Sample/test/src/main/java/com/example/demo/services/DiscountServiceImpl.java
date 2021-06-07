//package com.example.demo.services;
//
//import com.example.demo.entity.Discount;
//import com.example.demo.repository.DiscountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
//@Service
//public class DiscountServiceImpl implements DiscountService {
//    @Autowired
//    private DiscountRepository discountRepository;
//
//    //=============================================================
//    @Override
//    public List<Discount> findAll() {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findAll(Pageable pageable) {
//        return this.discountRepository.findAll(pageable);
//    }
//
//    @Override
//    public Page<Discount> findAllAndSortByStartTime(Pageable pageable) {
//        return this.discountRepository.findAllAndSortByStartTime(pageable);
//    }
//
//    @Override
//    public Page<Discount> findAllAndSortByFinishTime(Pageable pageable) {
//        return this.discountRepository.findAllAndSortByStartTime(pageable);
//    }
//
//    @Override
//    public Page<Discount> findAllAndSortByDecreaseValue(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findByStartTitle(Pageable pageable, String Title) {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findByStartTimeContaining(Pageable pageable, String StartDate) {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findByFinishTimeContaining(Pageable pageable, String FinishDate) {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findAllAndSortByDecreaseValue(Pageable pageable, String DecreaseValue) {
//        return null;
//    }
//
//    @Override
//    public Page<Discount> findByDecreaseValueAndStartTimeAndFinishTimeContaining(Pageable pageable, String DecreaseValue, String StartDate, String FinishDate) {
//        return null;
//    }
//
//    @Override
//    public void deleteDiscount(String title) {
//
//    }
//
//    @Override
//    public void save(Discount title) {
//        this.discountRepository.save(title);
//    }
//
//    @Override
//    public void update(Discount discount) {
//
//    }
//
//}
////        @Override
////        public Discount findBy(Integer id) {
////            return this.productRepository.findById(id).orElse(null);
////        }
//
//
