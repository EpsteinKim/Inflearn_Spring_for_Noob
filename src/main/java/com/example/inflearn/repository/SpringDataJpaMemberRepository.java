package com.example.inflearn.repository;

import com.example.inflearn.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // JPQL select m from Member m where m.name = ?
    Optional<Member> findByName(String name);
}
