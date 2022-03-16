package com.example.is.repo;

import com.example.is.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<Users,Long> {
    Optional<Users> findByUserName(String name); //Tim kiem User co ton tai trong DB khong?
    Boolean existsByUserName(String username); //username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email); //email da co trong DB chua
}
