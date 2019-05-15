package com.bank.dao;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 14/05/2019
 *
 */

import com.bank.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employees,Long> {

}
