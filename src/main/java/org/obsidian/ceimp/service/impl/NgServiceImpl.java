package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NgBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.dao.NgMapper;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.Ng;
import org.obsidian.ceimp.entity.NgExample;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.NgService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class NgServiceImpl implements NgService {

    @Autowired
    private NgMapper ngMapper;

    @Autowired
    private UserBasicService userBasicService;


    @Autowired
    private AwardMapper awardMapper;

    @Transactional
    @Override
    public Ng selectByUserIdAndYearScope(Long userId,Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ng> list = ngMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Ng> selectAllByUserId(Long userId) {
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId);
        List<Ng> list = ngMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public NgBean getNgBeanByUserIdAndYearScope(Long userId,Integer yearScope) {
        NgBean ngBean = new NgBean();
        ngBean.setTs(TimeUtil.getInstance().getThisYear());
        ngBean.setTe(TimeUtil.getInstance().getThisYear() + 1);
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ng> ngList = ngMapper.selectByExample(example);
        if(!ngList.isEmpty()){
            Ng ng = ngList.get(0);
            ngBean.setResident(ng.getResident());
            ngBean.setIncomeSource(ng.getIncomeSource());
            ngBean.setMonthIncome(ng.getMonthIncome());
            ngBean.setFamilySum(ng.getFamilySum());
            ngBean.setAddress(ng.getAddress());
            ngBean.setPostalCode(ng.getPostalCode());
            ngBean.setSituation(ng.getSituation());
            ngBean.setfName1(ng.getfName1());
            ngBean.setAge1(ng.getAge1());
            ngBean.setRelation1(ng.getRelation1());
            ngBean.setWorkPlace1(ng.getWorkPlace1());
            ngBean.setfName2(ng.getfName2());
            ngBean.setAge2(ng.getAge2());
            ngBean.setRelation2(ng.getRelation2());
            ngBean.setWorkPlace2(ng.getWorkPlace2());
            ngBean.setfName3(ng.getfName3());
            ngBean.setAge3(ng.getAge3());
            ngBean.setRelation3(ng.getRelation3());
            ngBean.setWorkPlace3(ng.getWorkPlace3());
            ngBean.setfName4(ng.getfName4());
            ngBean.setAge4(ng.getAge4());
            ngBean.setRelation4(ng.getRelation4());
            ngBean.setWorkPlace4(ng.getWorkPlace4());
            ngBean.setfName5(ng.getfName5());
            ngBean.setAge5(ng.getAge5());
            ngBean.setRelation5(ng.getRelation5());
            ngBean.setWorkPlace5(ng.getWorkPlace5());
            ngBean.setApplyReason(ng.getApplyReason());
            ngBean.setOpinion(ng.getOpinion());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            ngBean.setMajor(userBasicBean.getMajor());
            ngBean.setClassNum(userBasicBean.getClassNum());
            ngBean.setUsername(userBasicBean.getUsername());
            ngBean.setSex(userBasicBean.getSex());
            ngBean.setBirth(userBasicBean.getBirth());
            ngBean.setAccount(userBasicBean.getAccount());
            ngBean.setNation(userBasicBean.getNation());
            ngBean.setEntrance(userBasicBean.getEntrance());
            ngBean.setPolitical(userBasicBean.getPolitical());
            ngBean.setPhone(userBasicBean.getPhone());
            ngBean.setIdentity(userBasicBean.getIdentity());
        }
        return ngBean;
    }

    @Transactional
    @Override
    public Ng updateNgBeanByUserIdAndYearScope(NgBean ngBean,Long userId,int yearScope) {
        UserBasic userBasic = userBasicService.selectByUserId(userId);
        BeanUtils.copyProperties(ngBean,userBasic);
        Ng ng = new Ng();
        BeanUtils.copyProperties(ngBean,ng);
        ng.setUserId(userId);
        ng.setYearScope(yearScope);
        return ng;
    }

    @Transactional
    @Override
    public int insertNgBeanByUserIdAndYearScope(NgBean ngBean, Long userId,int yearScope) {
        Award award = awardMapper.selectByUserIdAndSubNameAndYearScope(userId,"ng",yearScope);
        award.setIsFilled(1);
        awardMapper.updateByPrimaryKey(award);
        Ng ng = updateNgBeanByUserIdAndYearScope(ngBean,userId,yearScope);
        return ngMapper.insertSelective(ng);
    }
}
