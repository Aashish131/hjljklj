package com.portal.daosimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.portal.daos.UserDaos;
import com.portal.models.User;
@Repository("UserDaos")

public class UserDaosImpl implements UserDaos {
@Autowired
SessionFactory sessionFactory;


public User validateUser(int id, String password) {
                try {
                                Session session=sessionFactory.getCurrentSession();
                                User userObj=session.get(User.class,id);
                                if(userObj!=null)
                                {
                                                if(userObj.getPassword().equals(password))
                                                {
                                                                System.out.println(userObj);
                                                                return userObj;
                                                }
                                }
                }catch (Exception e) {
                                e.printStackTrace();
                }

                return null;
}


public List<User> getAllDeveloper() {
                try{
                                Session session=sessionFactory.getCurrentSession();
                    Query q=session.createQuery("from com.portal.models.User where 	Designation='developer'");
                    List<User> uList=q.list();
                    return uList;
                }catch (Exception e) {
                                e.printStackTrace();
                }
                return null;
}


public List<User> getAllTester() {
                try{
                                Session session=sessionFactory.getCurrentSession();
                    Query q=session.createQuery("from com.portal.models.User where Designation='tester'");
                    List<User> uList=q.list();
                    return uList;
                }catch (Exception e) {
                                e.printStackTrace();
                }
                return null;
}


public User getUserById(int userId) {
                try {
                                Session session=sessionFactory.getCurrentSession();
                                User userObj=session.get(User.class,userId);
                                return userObj;
                }catch (Exception e) {
                                e.printStackTrace();
                }

                return null;
}
}

