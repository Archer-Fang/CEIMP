package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.NationalinspirationalscholarshipMapper;
import org.obsidian.ceimp.entity.Nationalinspirationalscholarship;
import org.obsidian.ceimp.entity.NationalinspirationalscholarshipExample;
import org.obsidian.ceimp.service.NationalinspirationalscholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
@Service
public class NationalinspirationalscholarshipServiceImpl implements NationalinspirationalscholarshipService {

    @Autowired
    private NationalinspirationalscholarshipMapper nationalinspirationalscholarshipMapper;

    @Transactional
    @Override
    public int insertNationalinspirationalscholarship(String userId, String date1, String award1, String unit1, String date2, String award2, String unit2, String date3, String award3, String unit3, String date4, String award4, String unit4, String resident, String incomeSource, String monthIncome, String familySum, String address, String postalCode, String situation, String applyReason, String opinion) {
        return 0;
    }

    @Transactional
    @Override
    public int updateNationalinspirationalscholarship(String userId, String date1, String award1, String unit1, String date2, String award2, String unit2, String date3, String award3, String unit3, String date4, String award4, String unit4, String resident, String incomeSource, String monthIncome, String familySum, String address, String postalCode, String situation, String applyReason, String opinion) {
        return 0;
    }

    @Transactional
    @Override
    public int deleteNationalinspirationalscholarship(String userId) {
        return 0;
    }

    @Transactional
    @Override
    public Nationalinspirationalscholarship selectByUserId(String userId) {
        NationalinspirationalscholarshipExample example = new NationalinspirationalscholarshipExample();
        example.or().andUseridEqualTo(userId);
        List<Nationalinspirationalscholarship> list = nationalinspirationalscholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}