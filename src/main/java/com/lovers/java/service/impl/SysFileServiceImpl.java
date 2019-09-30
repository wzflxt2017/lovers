package com.lovers.java.service.impl;

import com.lovers.java.domain.SysFile;
import com.lovers.java.domain.SysFileExample;
import com.lovers.java.mapper.SysFileMapper;
import com.lovers.java.service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-28 16:46
 * @Description:
 */
@Service
public class SysFileServiceImpl implements SysFileService {

    @Autowired
    private SysFileMapper sysFileMapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId) {
        return sysFileMapper.deleteByPrimaryKey(fileId);
    }

    @Override
    public int insert(SysFile record) {
        return sysFileMapper.insert(record);
    }

    @Override
    public SysFile selectByPrimaryKey(Integer fileId) {
        return sysFileMapper.selectByPrimaryKey(fileId);
    }

    @Override
    public List<SysFile> selectByIds(String fileIds) {
        SysFileExample example = new SysFileExample();
        SysFileExample.Criteria criteria = example.createCriteria();
        String[] split = fileIds.split(",");
        List<Integer> ids=new ArrayList<>();
        for(String s:split){
            if(!StringUtils.isEmpty(s)){
                ids.add(Integer.parseInt(s));
            }
        }
        criteria.andFileIdIn(ids);
        return sysFileMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKey(SysFile record) {
        return sysFileMapper.updateByPrimaryKey(record);
    }

}
