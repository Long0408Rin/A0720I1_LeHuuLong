//package com.example.demo.repository;
//
//
//import com.example.demo.entity.Discount;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DiscountRepository extends JpaRepository<Discount, Integer> {
//
//    Page<Discount> findAllAndSortByStartTime(Pageable pageable);
//    Page<Discount> findAllAndSortByFinishTime(Pageable pageable);
//
//    @Query(value = "select * from discount where discountvalue like %?1%", nativeQuery = true)
//    Page<Discount> findByStartTimeContaining(Pageable pageable, String all);
//
//
//    @Query(value = "select * from discount where `name` like %?1% and price like %?2%", nativeQuery = true)
//    Page<Discount> findByNameAndAddressContainingOfMe(Pageable pageable, String starttime, String finishtime);
//
//    @Query(value = "select * from discount where product_type_id like %?1% and `name` like %?2% and price like %?3%",
//            nativeQuery = true)
//    Page<Discount> findByAllContaining(Pageable pageable, String type, String name, String price);
//
//    @Query(value = "select * from discount group by id order by id", nativeQuery = true)
//    Page<Discount> findAllAndSortByID(Pageable pageable);
//
//    @Query(value = "select * from discount group by id order by `name`", nativeQuery = true)
//    Page<Discount> findAllAndSortByName(Pageable pageable);
//
//    @Query(value = "select * from discount group by id order by price desc", nativeQuery = true)
//    Page<Discount> findAllAndSortByBirthDay(Pageable pageable);
//
//
//}
//
