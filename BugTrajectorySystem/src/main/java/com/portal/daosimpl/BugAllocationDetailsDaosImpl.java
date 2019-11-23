package com.portal.daosimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.portal.daos.BugAllocationDetailsDaos;
import com.portal.models.BugAllocationDetails;

@Repository("BugAllocationDaos")
public class BugAllocationDetailsDaosImpl implements BugAllocationDetailsDaos {
                @Autowired
    SessionFactory sessionFactory;
                public boolean saveBugDetails(BugAllocationDetails bugAllocate) {
                                try{
                                                Session session=sessionFactory.getCurrentSession();
                                   session.save(bugAllocate);
                                   return true;
                                }catch (Exception e) {
                                                e.printStackTrace();
                                }
                                return false;
                }

}
