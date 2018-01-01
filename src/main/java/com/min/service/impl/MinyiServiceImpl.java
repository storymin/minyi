package com.min.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.min.dao.MinyiMapper;
import com.min.entity.UserEntity;
import com.min.service.MinyiService;

@Service("minyiService")
public class MinyiServiceImpl implements MinyiService
{
    @Autowired
    @Qualifier("minyiMapper")
    private MinyiMapper minyiMapper;
    
    public UserEntity getAll()
    {
        List<UserEntity> userEntity=minyiMapper.selectAll();
        UserEntity userEntity2=userEntity.get(0);
        return userEntity2;
    }
    
}
