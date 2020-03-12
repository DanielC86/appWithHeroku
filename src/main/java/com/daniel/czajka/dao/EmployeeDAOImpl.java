package com.daniel.czajka.dao;

import com.daniel.czajka.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    //define entity manager
    private EntityManager entityManager;

    //setup constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //create query
        Query<Employee> theEmployeeQuery = currentSession.createQuery("from Employee", Employee.class);

        //execute theQuery
        List<Employee> allEmployees = theEmployeeQuery.getResultList();

        //and return the result
        return allEmployees;
    }

    @Override
    public Employee findById(int theEmpId) {

        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //get the employee
        Employee theEmployee = currentSession.get(Employee.class, theEmpId);

        //return the result
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {

        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //save the object
        currentSession.saveOrUpdate(theEmployee);

    }

    @Override
    public void deleteById(int theId) {

        //get current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //delete the object by id (by query)
        Query deleteEmpQuery = currentSession.createQuery("delete from Employee where id=:employeeId");

        //set the id parameter for query
        deleteEmpQuery.setParameter("employeeID", theId);

        //execute the query
        deleteEmpQuery.executeUpdate();


    }
}
