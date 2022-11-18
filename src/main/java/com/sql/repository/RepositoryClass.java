package com.sql.repository;

import java.util.*;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.sql.model.ModelClass;


@Repository
public class RepositoryClass {

	@Autowired
	JdbcTemplate jdbcTemplate;

	static final String SQL = "select * from RANJITH_EMP";

	public List<ModelClass> Read() {
		
		List<ModelClass> employee = new ArrayList<ModelClass>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			ModelClass emp = new ModelClass();

			emp.setEmpNo((int) row.get("empNo"));
			emp.setEmpName((String) row.get("empName"));
			emp.setEmpAge((int) row.get("empAge"));

			employee.add(emp);
		}

		return employee;

	}

}
