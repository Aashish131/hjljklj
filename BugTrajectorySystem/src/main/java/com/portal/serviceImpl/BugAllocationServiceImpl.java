package com.portal.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.daos.BugAllocationDetailsDaos;
import com.portal.models.BugAllocationDetails;
import com.portal.service.BugAllocationService;
@Transactional
@Service("BugAllocationDetailService")
public class BugAllocationServiceImpl implements BugAllocationService {

                @Autowired
                BugAllocationDetailsDaos bugAllocationDetailDao;
                
                public boolean saveBugDetails(BugAllocationDetails bugAllocate) {
                                return bugAllocationDetailDao.saveBugDetails(bugAllocate);
                }

}
