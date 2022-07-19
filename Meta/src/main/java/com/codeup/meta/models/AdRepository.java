package com.codeup.meta.models;


import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
    Ad findAll(String title);
    Ad findByTitle(String title); // select * from ads where title = ?
//    Ad findFirstByTitle(String title); // select * from ads where title = ? limit 1
}
