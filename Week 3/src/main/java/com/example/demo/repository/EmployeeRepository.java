package com.example.demo.repository;
import com.example.demo.Employee;
import com.example.demo.projection.EmployeeInfo;
import com.example.demo.projection.EmployeeNameDepartmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;




import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query("SELECT new com.example.employeemanagementsystem.projection.EmployeeInfo(e.name, e.email) " +
	           "FROM Employee e WHERE e.department.name = :departmentName")
	    List<EmployeeInfo> findEmployeeInfoByDepartment(@Param("departmentName") String departmentName);

	List<EmployeeNameDepartmentProjection> findByDepartmentName(String departmentName);
}


   