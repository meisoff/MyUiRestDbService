package ru.arkhipov.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arkhipov.MyUiRestDbService.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}